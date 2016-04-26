package com.kickstarter.viewmodels.inputs;

import com.kickstarter.ui.adapters.DiscoveryDrawerAdapter;
import com.kickstarter.ui.adapters.DiscoveryPagerAdapter;

public interface DiscoveryViewModelInputs extends DiscoveryDrawerAdapter.Delegate, DiscoveryPagerAdapter.Delegate {
  /**
   * Call when you want to open or close the drawer.
   */
  void openDrawer(final boolean open);

  /**
   * Call when a tab is selected by the user.
   */
  void pageChanged(final int position);
}
