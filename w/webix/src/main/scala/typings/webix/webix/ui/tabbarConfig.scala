package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.EventHash
import typings.webix.webix.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait tabbarConfig extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var animate: js.UndefOr[js.Any] = js.undefined
  var attributes: js.UndefOr[js.Any] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var bottomLabel: js.UndefOr[String] = js.undefined
  var bottomOffset: js.UndefOr[Double] = js.undefined
  var bottomPadding: js.UndefOr[Double] = js.undefined
  var click: js.UndefOr[WebixCallback] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[js.Any] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var hotkey: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var inputAlign: js.UndefOr[String] = js.undefined
  var inputHeight: js.UndefOr[Double] = js.undefined
  var inputWidth: js.UndefOr[Double] = js.undefined
  var invalid: js.UndefOr[Boolean] = js.undefined
  var invalidMessage: js.UndefOr[String] = js.undefined
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelAlign: js.UndefOr[String] = js.undefined
  var labelPosition: js.UndefOr[String] = js.undefined
  var labelWidth: js.UndefOr[Double] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var moreTemplate: js.UndefOr[WebixCallback] = js.undefined
  var multiview: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var optionWidth: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[js.Array[_]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popup: js.UndefOr[String] = js.undefined
  var popupTemplate: js.UndefOr[WebixCallback] = js.undefined
  var popupWidth: js.UndefOr[Double] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var relatedAction: js.UndefOr[String] = js.undefined
  var relatedView: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var suggest: js.UndefOr[js.Any] = js.undefined
  var tabMargin: js.UndefOr[Double] = js.undefined
  var tabMinWidth: js.UndefOr[Double] = js.undefined
  var tabMoreWidth: js.UndefOr[Double] = js.undefined
  var tabOffset: js.UndefOr[Double] = js.undefined
  var tabbarPopup: js.UndefOr[baseview] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var topOffset: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[WebixCallback] = js.undefined
  var validateEvent: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var yCount: js.UndefOr[Double] = js.undefined
}

object tabbarConfig {
  @scala.inline
  def apply(
    align: String = null,
    animate: js.Any = null,
    attributes: js.Any = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    bottomLabel: String = null,
    bottomOffset: Int | Double = null,
    bottomPadding: Int | Double = null,
    click: /* repeated */ js.Any => js.Any = null,
    container: String | HTMLElement = null,
    css: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    format: js.Any = null,
    gravity: Int | Double = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hotkey: String = null,
    id: String | Double = null,
    inputAlign: String = null,
    inputHeight: Int | Double = null,
    inputWidth: Int | Double = null,
    invalid: js.UndefOr[Boolean] = js.undefined,
    invalidMessage: String = null,
    keyPressTimeout: Int | Double = null,
    label: String = null,
    labelAlign: String = null,
    labelPosition: String = null,
    labelWidth: Int | Double = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    moreTemplate: /* repeated */ js.Any => js.Any = null,
    multiview: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    on: EventHash = null,
    optionWidth: Int | Double = null,
    options: js.Array[_] = null,
    placeholder: String = null,
    popup: String = null,
    popupTemplate: /* repeated */ js.Any => js.Any = null,
    popupWidth: Int | Double = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    relatedAction: String = null,
    relatedView: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    suggest: js.Any = null,
    tabMargin: Int | Double = null,
    tabMinWidth: Int | Double = null,
    tabMoreWidth: Int | Double = null,
    tabOffset: Int | Double = null,
    tabbarPopup: baseview = null,
    tooltip: js.Any = null,
    topOffset: Int | Double = null,
    `type`: String = null,
    validate: /* repeated */ js.Any => js.Any = null,
    validateEvent: String = null,
    value: String | Double = null,
    view: String = null,
    width: Int | Double = null,
    yCount: Int | Double = null
  ): tabbarConfig = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (bottomLabel != null) __obj.updateDynamic("bottomLabel")(bottomLabel.asInstanceOf[js.Any])
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (bottomPadding != null) __obj.updateDynamic("bottomPadding")(bottomPadding.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (hotkey != null) __obj.updateDynamic("hotkey")(hotkey.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputAlign != null) __obj.updateDynamic("inputAlign")(inputAlign.asInstanceOf[js.Any])
    if (inputHeight != null) __obj.updateDynamic("inputHeight")(inputHeight.asInstanceOf[js.Any])
    if (inputWidth != null) __obj.updateDynamic("inputWidth")(inputWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(invalid)) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    if (invalidMessage != null) __obj.updateDynamic("invalidMessage")(invalidMessage.asInstanceOf[js.Any])
    if (keyPressTimeout != null) __obj.updateDynamic("keyPressTimeout")(keyPressTimeout.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelWidth != null) __obj.updateDynamic("labelWidth")(labelWidth.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (moreTemplate != null) __obj.updateDynamic("moreTemplate")(js.Any.fromFunction1(moreTemplate))
    if (!js.isUndefined(multiview)) __obj.updateDynamic("multiview")(multiview.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (optionWidth != null) __obj.updateDynamic("optionWidth")(optionWidth.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(js.Any.fromFunction1(popupTemplate))
    if (popupWidth != null) __obj.updateDynamic("popupWidth")(popupWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (relatedAction != null) __obj.updateDynamic("relatedAction")(relatedAction.asInstanceOf[js.Any])
    if (relatedView != null) __obj.updateDynamic("relatedView")(relatedView.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (suggest != null) __obj.updateDynamic("suggest")(suggest.asInstanceOf[js.Any])
    if (tabMargin != null) __obj.updateDynamic("tabMargin")(tabMargin.asInstanceOf[js.Any])
    if (tabMinWidth != null) __obj.updateDynamic("tabMinWidth")(tabMinWidth.asInstanceOf[js.Any])
    if (tabMoreWidth != null) __obj.updateDynamic("tabMoreWidth")(tabMoreWidth.asInstanceOf[js.Any])
    if (tabOffset != null) __obj.updateDynamic("tabOffset")(tabOffset.asInstanceOf[js.Any])
    if (tabbarPopup != null) __obj.updateDynamic("tabbarPopup")(tabbarPopup.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    if (validateEvent != null) __obj.updateDynamic("validateEvent")(validateEvent.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (yCount != null) __obj.updateDynamic("yCount")(yCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[tabbarConfig]
  }
}

