package arquitetura.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.log4j.Logger;

/**
 * 
 * @author edipofederle<edipofederle@gmail.com>
 *
 */
public class FileUtils {

	private static final Logger LOGGER = Logger.getLogger(FileUtils.class);

	/**
	 * Execute the create of directory
	 * 
	 * @param path
	 */
	public static void createDirectory(Path path) {
		try {
			LOGGER.info("Verificando existencia do diretorio: " + path);
			if (!Files.exists(path)) {
				LOGGER.info("Criando diretório..." + path);
				Files.createDirectory(path);
				LOGGER.info("Diretório criado " + path);
			} else {
				LOGGER.info("Diretório já existente");
			}
		} catch (IOException e) {
			LOGGER.info("Não foi possível criar o diretório home", e);
		}
	}

	public static void copy(Path source, Path target) {
		try {
			LOGGER.info("Copiando de: " + source + " para " + target);
			Files.copy(source, target);
			LOGGER.info("Copia concluída com sucesso");
		} catch (IOException e) {
			LOGGER.info("Não foi possível criar o diretório home", e);
		}
	}

	public static void copy(String fileName, Path target) {
		try {
			InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
			LOGGER.info("Copiando de: " + fileName + " para " + target);
			Files.copy(inputStream, target);
			LOGGER.info("Copia concluída com sucesso");
		} catch (IOException e) {
			LOGGER.info("Não foi possível criar o diretório home", e);
		}
	}

	public static void moveFiles(String to, String from) {
		InputStream inStream = null;
		OutputStream outStream = null;

		try {

			File afile = new File(to);
			File bfile = new File(from);

			inStream = new FileInputStream(afile);
			outStream = new FileOutputStream(bfile);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = inStream.read(buffer)) > 0) {
				outStream.write(buffer, 0, length);
			}

			inStream.close();
			outStream.flush();
			outStream.close();

			afile.delete();

			// LOGGER.info("File is copied to "+ to + " from: "+ from + "
			// successful!");

		} catch (IOException e) {
			LOGGER.info("Erros when copying files. Here are message error: " + e.getMessage());
		}
	}
}