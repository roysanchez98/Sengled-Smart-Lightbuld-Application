package com.example.android.sengledsmartlightapplication;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.android.sengledsmartlightapplication.databinding.FragmentHomeBindingImpl;
import com.example.android.sengledsmartlightapplication.databinding.FragmentSignInPageBindingImpl;
import com.example.android.sengledsmartlightapplication.databinding.HomeFragmentOnBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTHOME = 1;

  private static final int LAYOUT_FRAGMENTSIGNINPAGE = 2;

  private static final int LAYOUT_HOMEFRAGMENTON = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.sengledsmartlightapplication.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.sengledsmartlightapplication.R.layout.fragment_sign_in_page, LAYOUT_FRAGMENTSIGNINPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.sengledsmartlightapplication.R.layout.home_fragment_on, LAYOUT_HOMEFRAGMENTON);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNINPAGE: {
          if ("layout/fragment_sign_in_page_0".equals(tag)) {
            return new FragmentSignInPageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sign_in_page is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMEFRAGMENTON: {
          if ("layout/home_fragment_on_0".equals(tag)) {
            return new HomeFragmentOnBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_fragment_on is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_home_0", com.example.android.sengledsmartlightapplication.R.layout.fragment_home);
      sKeys.put("layout/fragment_sign_in_page_0", com.example.android.sengledsmartlightapplication.R.layout.fragment_sign_in_page);
      sKeys.put("layout/home_fragment_on_0", com.example.android.sengledsmartlightapplication.R.layout.home_fragment_on);
    }
  }
}
