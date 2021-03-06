package typings.grommet

import typings.grommet.grommetStrings.key
import typings.grommet.grommetStrings.ref
import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import typings.react.reactMod.ComponentProps
import typings.react.reactMod.ReactComponentElement
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundContainer extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var container: js.UndefOr[Anon_ExtendExtendType] = js.undefined
  var control: js.UndefOr[Anon_ExtendOpen] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var icons: js.UndefOr[Anon_DownMargin] = js.undefined
  var options: js.UndefOr[Anon_Container] = js.undefined
  // https://github.com/DefinitelyTyped/DefinitelyTyped/issues/37506
  var searchInput: js.UndefOr[ReactComponentElement[_, Pick[ComponentProps[_], Exclude[String, key | ref]]]] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object Anon_BackgroundContainer {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    container: Anon_ExtendExtendType = null,
    control: Anon_ExtendOpen = null,
    extend: ExtendType = null,
    icons: Anon_DownMargin = null,
    options: Anon_Container = null,
    searchInput: ReactComponentElement[_, Pick[ComponentProps[_], Exclude[String, key | ref]]] = null,
    step: Int | Double = null
  ): Anon_BackgroundContainer = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (searchInput != null) __obj.updateDynamic("searchInput")(searchInput.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundContainer]
  }
}

