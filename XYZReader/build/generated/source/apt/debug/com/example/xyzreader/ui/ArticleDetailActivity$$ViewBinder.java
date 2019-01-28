// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleDetailActivity$$ViewBinder<T extends com.example.xyzreader.ui.ArticleDetailActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230873, "field 'mUpButtonContainer'");
    target.mUpButtonContainer = finder.castView(view, 2131230873, "field 'mUpButtonContainer'");
    view = finder.findRequiredView(source, 2131230738, "field 'mUpButton'");
    target.mUpButton = finder.castView(view, 2131230738, "field 'mUpButton'");
    view = finder.findRequiredView(source, 2131230809, "field 'mPager'");
    target.mPager = finder.castView(view, 2131230809, "field 'mPager'");
  }

  @Override public void unbind(T target) {
    target.mUpButtonContainer = null;
    target.mUpButton = null;
    target.mPager = null;
  }
}
