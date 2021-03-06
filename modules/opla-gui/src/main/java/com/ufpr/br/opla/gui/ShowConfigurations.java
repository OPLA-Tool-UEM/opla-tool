/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.br.opla.gui;

import java.util.HashMap;

import org.apache.commons.lang.WordUtils;
import org.apache.log4j.Logger;

import com.ufpr.br.opla.utils.Utils;

import persistence.ExperimentConfs;

/**
 *
 * @author elf
 */
public class ShowConfigurations extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	private Logger LOGGER = Logger.getLogger(ShowConfigurations.class);

	private String experimentId;
	private String directoryToExportModels;

	ShowConfigurations() {
		initComponents();

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		labelObjectiveFunctions = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		labelPatterns = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		labelPatternStrategy = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		algorithmName = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		numberOfRuns = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		maxEvaluations = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		populationSize = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		archiveSize = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		mutationProbability = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		mutationOperators = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		crossoverProbability = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		plaName = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		labelProfiles = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Objective Functions", 0, 0,
				new java.awt.Font("Verdana", 1, 14), java.awt.Color.magenta)); // NOI18N

		labelObjectiveFunctions.setText("jLabel12");

		org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(jPanel1Layout.createSequentialGroup().addContainerGap()
						.add(labelObjectiveFunctions, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(jPanel1Layout.createSequentialGroup()
						.addContainerGap().add(labelObjectiveFunctions, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
								74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(84, Short.MAX_VALUE)));

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPLA-Patterns", 0, 0,
				new java.awt.Font("Verdana", 1, 14), new java.awt.Color(255, 0, 255))); // NOI18N

		jLabel7.setText("Patterns:");

		labelPatterns.setText("jLabel10");

		jLabel10.setText("Strategy:");

		labelPatternStrategy.setText("jLabel11");

		org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(jPanel2Layout.createSequentialGroup().addContainerGap()
						.add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
								.add(jPanel2Layout.createSequentialGroup().add(jLabel7)
										.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(labelPatterns,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												179, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
								.add(jPanel2Layout.createSequentialGroup().add(jLabel10)
										.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(
												labelPatternStrategy, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												257, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(jPanel2Layout.createSequentialGroup()
						.add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(jLabel7)
								.add(labelPatterns))
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(jLabel10)
								.add(labelPatternStrategy))
						.add(0, 62, Short.MAX_VALUE)));

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Algorithm Configuration", 0, 0,
				new java.awt.Font("Verdana", 1, 14), new java.awt.Color(255, 0, 255))); // NOI18N

		jLabel1.setText("Algorithm:");

		algorithmName.setText("jLabel7");

		jLabel2.setText("Number of Runs:");

		numberOfRuns.setText("jLabel7");

		jLabel4.setText("Max Evaluations:");

		maxEvaluations.setText("jLabel7");

		jLabel3.setText("Population Size:");

		populationSize.setText("jLabel7");

		jLabel5.setText("Archive Size:");

		archiveSize.setText("jLabel7");

		jLabel6.setText("Mutation Probability:");

		mutationProbability.setText("jLabel7");

		jLabel8.setText("Mutation Opreators:");

		mutationOperators.setText("jLabel7");

		jLabel9.setText("Crossover Probability");

		crossoverProbability.setText("jLabel7");

		jLabel11.setText("PLA:");

		plaName.setText("jLabel12");

		org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(jPanel3Layout.createSequentialGroup().addContainerGap().add(jPanel3Layout
						.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
						.add(jPanel3Layout.createSequentialGroup()
								.add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
										.add(jLabel4).add(jLabel3).add(jLabel5))
								.add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
										.add(jPanel3Layout.createSequentialGroup().add(46, 46, 46)
												.add(archiveSize,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
										.add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout
												.createSequentialGroup()
												.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED,
														org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.add(jPanel3Layout
														.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
														.add(org.jdesktop.layout.GroupLayout.TRAILING, populationSize,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(org.jdesktop.layout.GroupLayout.TRAILING, maxEvaluations,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
						.add(jPanel3Layout.createSequentialGroup()
								.add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
										.add(jLabel1).add(jLabel2).add(jLabel11))
								.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED,
										org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
										.add(org.jdesktop.layout.GroupLayout.TRAILING, numberOfRuns,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(org.jdesktop.layout.GroupLayout.TRAILING, algorithmName,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(plaName)))
						.add(jPanel3Layout.createSequentialGroup()
								.add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
										.add(jLabel9).add(jLabel8).add(jLabel6))
								.add(18, 18, 18)
								.add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
										.add(mutationProbability, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(mutationOperators, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(crossoverProbability, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(60, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(jPanel3Layout.createSequentialGroup()
						.add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(jLabel11)
								.add(plaName))
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
								.add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(algorithmName))
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
								.add(numberOfRuns).add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
						.add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
								.add(maxEvaluations).add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
						.add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
								.add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(populationSize))
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
						.add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
								.add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(archiveSize))
						.add(7, 7, 7)
						.add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
								.add(mutationProbability).add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
										27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
						.add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
								.add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(mutationOperators))
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
						.add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
								.add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(crossoverProbability))
						.addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Profiles", 0, 0,
				new java.awt.Font("Verdana", 1, 14), new java.awt.Color(255, 0, 255))); // NOI18N

		labelProfiles.setText("jLabel11");

		org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(jPanel4Layout.createSequentialGroup().addContainerGap().add(labelProfiles)
						.addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(jPanel4Layout.createSequentialGroup().addContainerGap().add(labelProfiles).addContainerGap(100,
						Short.MAX_VALUE)));

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(layout
				.createSequentialGroup().addContainerGap()
				.add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
						org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
				.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
						.add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 315,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addContainerGap(14, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(layout.createSequentialGroup().add(14, 14, 14)
						.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
								.add(layout.createSequentialGroup()
										.add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
										.add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(jPanel4,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
								.add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
										org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/*
		 * Set the Nimbus look and feel
		 */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ShowConfigurations.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ShowConfigurations.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ShowConfigurations.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ShowConfigurations.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/*
		 * Create and display the form
		 */
		java.awt.EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ShowConfigurations().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel algorithmName;
	private javax.swing.JLabel archiveSize;
	private javax.swing.JLabel crossoverProbability;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JLabel labelObjectiveFunctions;
	private javax.swing.JLabel labelPatternStrategy;
	private javax.swing.JLabel labelPatterns;
	private javax.swing.JLabel labelProfiles;
	private javax.swing.JLabel maxEvaluations;
	private javax.swing.JLabel mutationOperators;
	private javax.swing.JLabel mutationProbability;
	private javax.swing.JLabel numberOfRuns;
	private javax.swing.JLabel plaName;
	private javax.swing.JLabel populationSize;
	// End of variables declaration//GEN-END:variables

	public void fillFields() {
		try {
			HashMap<String, String> confs = ExperimentConfs.getConfigs(experimentId);
			plaName.setText(db.Database.getPlaUsedToExperimentId(experimentId));
			algorithmName.setText(confs.get("algorithm"));
			numberOfRuns.setText(confs.get("numberOfRuns"));
			maxEvaluations.setText(confs.get("maxEvaluations"));
			populationSize.setText(confs.get("populationSize"));
			archiveSize.setText(confs.get("archiveSize"));
			mutationProbability.setText(confs.get("mutationProbability"));
			mutationOperators.setText(formatOutput(confs.get("mutationOperators"), true));
			crossoverProbability.setText(confs.get("crossoverProbability"));
			labelPatterns.setText(formatOutput(confs.get("patterns"), true));
			labelPatternStrategy.setText(confs.get("pattern_strategy"));
			labelObjectiveFunctions.setText(formatOutput(confs.get("objective_functions"), true));

			labelProfiles.setText(formatOutput(
					Utils.getProfilesUsedForSelectedExperiment(this.experimentId, this.directoryToExportModels),
					false));
		} catch (Exception e) {
			LOGGER.info(e);
		}
	}

	private String formatOutput(String operators, boolean capitalize) {
		if (operators.isEmpty())
			return "-";

		StringBuilder formatedOperators = new StringBuilder();
		formatedOperators.append("<html>");
		String[] o = null;

		if (operators.contains(",")) {
			o = operators.split(",");
		} else {
			o = operators.split(" ");
		}
		for (String operator : o) {
			formatedOperators.append(capitalize ? WordUtils.capitalize(operator) : operator);
			formatedOperators.append("<br>");
		}
		formatedOperators.append("</html>");

		return formatedOperators.toString();
	}

	void setDirOutput(String directoryToExportModels) {
		this.directoryToExportModels = directoryToExportModels;
	}

	void setExperimentId(String selectedExperiment) {
		this.experimentId = selectedExperiment;
	}
}
