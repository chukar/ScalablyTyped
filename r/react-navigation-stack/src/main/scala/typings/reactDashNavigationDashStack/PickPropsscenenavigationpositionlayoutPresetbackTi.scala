package typings.reactDashNavigationDashStack

import typings.reactDashNative.reactDashNativeMod.Animated.Value
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderLayoutPreset
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderMode
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderTransitionPreset
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionerLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-navigation-stack.react-navigation-stack/lib/typescript/views/Header/Header.Props, 'scene' | 'navigation' | 'position' | 'layoutPreset' | 'backTitleVisible' | 'scenes' | 'layout' | 'mode' | 'transitionPreset' | 'leftInterpolator' | 'titleInterpolator' | 'rightInterpolator' | 'backgroundInterpolator' | 'leftLabelInterpolator' | 'leftButtonInterpolator' | 'titleFromLeftInterpolator' | 'layoutInterpolator' | 'theme'> */
trait PickPropsscenenavigationpositionlayoutPresetbackTi extends js.Object {
  var backTitleVisible: js.UndefOr[Boolean] = js.undefined
  var backgroundInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var layout: TransitionerLayout
  var layoutInterpolator: js.Function1[/* props */ SceneInterpolatorProps, _]
  var layoutPreset: HeaderLayoutPreset
  var leftButtonInterpolator: js.Function1[/* props */ SceneInterpolatorProps, _]
  var leftInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var leftLabelInterpolator: js.Function1[/* props */ SceneInterpolatorProps, _]
  var mode: HeaderMode
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var position: Value
  var rightInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var scene: Scene
  var scenes: js.Array[Scene]
  var theme: String
  var titleFromLeftInterpolator: js.Function1[/* props */ SceneInterpolatorProps, _]
  var titleInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var transitionPreset: js.UndefOr[HeaderTransitionPreset] = js.undefined
}

object PickPropsscenenavigationpositionlayoutPresetbackTi {
  @scala.inline
  def apply(
    layout: TransitionerLayout,
    layoutInterpolator: /* props */ SceneInterpolatorProps => _,
    layoutPreset: HeaderLayoutPreset,
    leftButtonInterpolator: /* props */ SceneInterpolatorProps => _,
    leftLabelInterpolator: /* props */ SceneInterpolatorProps => _,
    mode: HeaderMode,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    position: Value,
    scene: Scene,
    scenes: js.Array[Scene],
    theme: String,
    titleFromLeftInterpolator: /* props */ SceneInterpolatorProps => _,
    backTitleVisible: js.UndefOr[Boolean] = js.undefined,
    backgroundInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    leftInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    rightInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    titleInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    transitionPreset: HeaderTransitionPreset = null
  ): PickPropsscenenavigationpositionlayoutPresetbackTi = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], layoutInterpolator = js.Any.fromFunction1(layoutInterpolator), layoutPreset = layoutPreset.asInstanceOf[js.Any], leftButtonInterpolator = js.Any.fromFunction1(leftButtonInterpolator), leftLabelInterpolator = js.Any.fromFunction1(leftLabelInterpolator), mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], titleFromLeftInterpolator = js.Any.fromFunction1(titleFromLeftInterpolator))
    if (!js.isUndefined(backTitleVisible)) __obj.updateDynamic("backTitleVisible")(backTitleVisible.asInstanceOf[js.Any])
    if (backgroundInterpolator != null) __obj.updateDynamic("backgroundInterpolator")(js.Any.fromFunction1(backgroundInterpolator))
    if (leftInterpolator != null) __obj.updateDynamic("leftInterpolator")(js.Any.fromFunction1(leftInterpolator))
    if (rightInterpolator != null) __obj.updateDynamic("rightInterpolator")(js.Any.fromFunction1(rightInterpolator))
    if (titleInterpolator != null) __obj.updateDynamic("titleInterpolator")(js.Any.fromFunction1(titleInterpolator))
    if (transitionPreset != null) __obj.updateDynamic("transitionPreset")(transitionPreset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropsscenenavigationpositionlayoutPresetbackTi]
  }
}

