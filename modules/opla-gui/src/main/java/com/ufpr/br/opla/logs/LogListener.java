/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufpr.br.opla.logs;

import javax.swing.JTextArea;

import com.ufpr.br.opla.utils.Time;

import br.ufpr.dinf.gres.loglog.Listener;
import br.ufpr.dinf.gres.loglog.LogLogData;

/**
 *
 * @author elf
 */
public class LogListener implements Listener{
  
  private JTextArea textArea;

  public LogListener(JTextArea logs) {
    this.textArea = logs;
  }

  @Override
  public void message() {
    
    this.textArea.append(Time.timeNow() + LogLogData.printLog()+"\n");
  }
  
}
