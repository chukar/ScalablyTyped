package typings.webix.webixMod.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.webix.webixMod.EventHash
import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait treeConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var click: js.UndefOr[String | WebixCallback] = js.undefined
  var clipboard: js.UndefOr[Boolean | String] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[String | js.Array[_]] = js.undefined
  var datathrottle: js.UndefOr[Double] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var drag: js.UndefOr[Boolean | String] = js.undefined
  var dragscroll: js.UndefOr[Boolean | String] = js.undefined
  var filterMode: js.UndefOr[js.Any] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var item: js.UndefOr[js.Any] = js.undefined
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var mouseEventDelay: js.UndefOr[Double] = js.undefined
  var multiselect: js.UndefOr[Boolean | String] = js.undefined
  var navigation: js.UndefOr[Boolean] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var onClick: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onContext: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onDblClick: js.UndefOr[WebixCallback] = js.undefined
  var onMouseMove: js.UndefOr[WebixCallback] = js.undefined
  var ready: js.UndefOr[WebixCallback] = js.undefined
  var removeMissed: js.UndefOr[Boolean] = js.undefined
  var rules: js.UndefOr[js.Any] = js.undefined
  var save: js.UndefOr[js.Any] = js.undefined
  var scheme: js.UndefOr[js.Any] = js.undefined
  var scroll: js.UndefOr[Boolean | String] = js.undefined
  var scrollSpeed: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String | WebixCallback] = js.undefined
  var templateCopy: js.UndefOr[WebixCallback] = js.undefined
  var threeState: js.UndefOr[Boolean] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object treeConfig {
  @scala.inline
  def apply(
    animate: js.Any = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    click: String | WebixCallback = null,
    clipboard: Boolean | String = null,
    container: String | HTMLElement = null,
    css: js.Any = null,
    data: String | js.Array[_] = null,
    datathrottle: Int | Double = null,
    datatype: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    drag: Boolean | String = null,
    dragscroll: Boolean | String = null,
    filterMode: js.Any = null,
    gravity: Int | Double = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    item: js.Any = null,
    keyPressTimeout: Int | Double = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    mouseEventDelay: Int | Double = null,
    multiselect: Boolean | String = null,
    navigation: js.UndefOr[Boolean] = js.undefined,
    on: EventHash = null,
    onClick: StringDictionary[js.Any] = null,
    onContext: StringDictionary[js.Any] = null,
    onDblClick: /* repeated */ js.Any => js.Any = null,
    onMouseMove: /* repeated */ js.Any => js.Any = null,
    ready: /* repeated */ js.Any => js.Any = null,
    removeMissed: js.UndefOr[Boolean] = js.undefined,
    rules: js.Any = null,
    save: js.Any = null,
    scheme: js.Any = null,
    scroll: Boolean | String = null,
    scrollSpeed: String = null,
    select: js.UndefOr[Boolean] = js.undefined,
    template: String | WebixCallback = null,
    templateCopy: /* repeated */ js.Any => js.Any = null,
    threeState: js.UndefOr[Boolean] = js.undefined,
    tooltip: js.Any = null,
    `type`: js.Any = null,
    url: js.Any = null,
    view: String = null,
    width: Int | Double = null
  ): treeConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (clipboard != null) __obj.updateDynamic("clipboard")(clipboard.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datathrottle != null) __obj.updateDynamic("datathrottle")(datathrottle.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(drag.asInstanceOf[js.Any])
    if (dragscroll != null) __obj.updateDynamic("dragscroll")(dragscroll.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (keyPressTimeout != null) __obj.updateDynamic("keyPressTimeout")(keyPressTimeout.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (mouseEventDelay != null) __obj.updateDynamic("mouseEventDelay")(mouseEventDelay.asInstanceOf[js.Any])
    if (multiselect != null) __obj.updateDynamic("multiselect")(multiselect.asInstanceOf[js.Any])
    if (!js.isUndefined(navigation)) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onContext != null) __obj.updateDynamic("onContext")(onContext.asInstanceOf[js.Any])
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1(onDblClick))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (!js.isUndefined(removeMissed)) __obj.updateDynamic("removeMissed")(removeMissed.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(save.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateCopy != null) __obj.updateDynamic("templateCopy")(js.Any.fromFunction1(templateCopy))
    if (!js.isUndefined(threeState)) __obj.updateDynamic("threeState")(threeState.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[treeConfig]
  }
}

