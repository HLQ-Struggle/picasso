package com.example.picasso;

import android.app.Application;
import com.squareup.picasso.Picasso;

// Note: Production apps should instead use the dependency injection design pattern to provide
// their Picasso instances.
public class SampleApplication extends Application {
  public Picasso picasso;

  @Override public void onCreate() {
    super.onCreate();
    picasso = new Picasso(this);
  }

  public Picasso picasso() {
    return picasso;
  }
}
