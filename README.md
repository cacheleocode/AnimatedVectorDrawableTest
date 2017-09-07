# AnimatedVectorDrawableTest
Native Android animation using the AnimatedVectorDrawable class

![snapshot](https://user-images.githubusercontent.com/2035397/30182851-2196547c-93cd-11e7-8edc-10bb223c5bc8.gif)

## Overview

[Adobe After Effects](http://www.adobe.com/products/aftereffects.html) animations can, with the use of the [bodymovin](https://github.com/bodymovin/bodymovin) plugin, be exported as XML for use as an Android [AnimatedVectorDrawable](https://developer.android.com/reference/android/graphics/drawable/AnimatedVectorDrawable.html).

## Alternative ([LottieTest repo](https://github.com/domingl/LottieTest))

Core animations (opacity, paths, solid fills etc.) could gain a performance improvement when using AnimatedVectorDrawable. Starting from API 25, AnimatedVectorDrawable runs on RenderThread as opposed to on UI thread, meaning animations remain smooth even when there is heavy UI thread workload.

Non-core animations such as gradient require the use of Lottie.
