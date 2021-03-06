package com.smartfluidicinterface.view.component;

import com.smartfluidicinterface.SmartFluidicInterface;

public final class StartButton extends AbstractButton {
  public StartButton(final int x, final int y) {
    super("Start", x, y);
  }

  @Override
  protected void doAction() {
    this.setEnabled(false);
    final long startTime = System.currentTimeMillis();
    SmartFluidicInterface.getInstance().getDataSaver().createFile();
    SmartFluidicInterface.getInstance().getBridge().startBridge(startTime);
    SmartFluidicInterface.getInstance().getMainPanel().getStopButton().setEnabled(true);
  }
}
