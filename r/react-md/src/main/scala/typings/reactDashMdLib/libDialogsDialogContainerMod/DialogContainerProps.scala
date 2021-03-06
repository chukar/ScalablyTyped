package typings
package reactDashMdLib.libDialogsDialogContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogContainerProps
  extends reactDashMdLib.libDialogsDialogMod.DialogProps
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var activeElementFocus: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var defaultVisibleTransitionable: js.UndefOr[scala.Boolean] = js.undefined
  var dialogClassName: js.UndefOr[java.lang.String] = js.undefined
  var dialogStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var lastChild: js.UndefOr[scala.Boolean] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var onHide: js.UndefOr[js.Function] = js.undefined
  var onShow: js.UndefOr[js.Function] = js.undefined
  var pageX: js.UndefOr[scala.Double] = js.undefined
  var pageY: js.UndefOr[scala.Double] = js.undefined
  var portal: js.UndefOr[scala.Boolean] = js.undefined
  var renderNode: js.UndefOr[js.Object] = js.undefined
  var transitionEnterTimeout: js.UndefOr[scala.Double] = js.undefined
  var transitionLeaveTimeout: js.UndefOr[scala.Double] = js.undefined
  var visible: scala.Boolean
}

object DialogContainerProps {
  @scala.inline
  def apply(
    id: reactDashMdLib.libMod.IdPropType,
    visible: scala.Boolean,
    StringDictionary: // for the `component` prop until refactored out
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    actions: reactLib.reactMod.ReactElement[_] | reactDashMdLib.libButtonsButtonMod.ButtonProps | (js.Array[
      reactLib.reactMod.ReactElement[_] | reactDashMdLib.libButtonsButtonMod.ButtonProps
    ]) = null,
    activeElementFocus: js.UndefOr[scala.Boolean] = js.undefined,
    additionalFocusKeys: js.Array[scala.Double] = null,
    `aria-describedby`: reactDashMdLib.libMod.IdPropType = null,
    `aria-label`: java.lang.String = null,
    `aria-labelledby`: reactDashMdLib.libMod.IdPropType = null,
    autopadContent: js.UndefOr[scala.Boolean] = js.undefined,
    autosizeContent: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    component: reactLib.reactMod.ReactType[_] = null,
    containFocus: js.UndefOr[scala.Boolean] = js.undefined,
    contentClassName: java.lang.String = null,
    contentComponent: reactLib.reactMod.ReactType[_] = null,
    contentProps: js.Object = null,
    contentStyle: reactLib.reactMod.CSSProperties = null,
    defaultVisibleTransitionable: js.UndefOr[scala.Boolean] = js.undefined,
    dialogClassName: java.lang.String = null,
    dialogStyle: reactLib.reactMod.CSSProperties = null,
    focusOnMount: js.UndefOr[scala.Boolean] = js.undefined,
    footerClassName: java.lang.String = null,
    footerStyle: reactLib.reactMod.CSSProperties = null,
    fullPage: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Double | java.lang.String = null,
    initialFocus: java.lang.String = null,
    lastChild: js.UndefOr[scala.Boolean] = js.undefined,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    onBlur: /* event */ reactLib.reactMod.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onClick: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onDrag: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnd: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnter: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragExit: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragLeave: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragOver: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragStart: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDrop: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onFocus: /* event */ reactLib.reactMod.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onHide: js.Function = null,
    onKeyDown: /* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyUp: /* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onMouseDown: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseEnter: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseLeave: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseMove: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOut: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOver: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseUp: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onShow: js.Function = null,
    onTouchCancel: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchEnd: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchMove: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchStart: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    paddedContent: js.UndefOr[scala.Boolean] = js.undefined,
    pageX: scala.Int | scala.Double = null,
    pageY: scala.Int | scala.Double = null,
    portal: js.UndefOr[scala.Boolean] = js.undefined,
    renderNode: js.Object = null,
    stackedActions: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    title: reactLib.reactMod.ReactNode = null,
    titleClassName: java.lang.String = null,
    titleStyle: reactLib.reactMod.CSSProperties = null,
    transitionEnterTimeout: scala.Int | scala.Double = null,
    transitionLeaveTimeout: scala.Int | scala.Double = null,
    width: scala.Double | java.lang.String = null
  ): DialogContainerProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], visible = visible)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(activeElementFocus)) __obj.updateDynamic("activeElementFocus")(activeElementFocus)
    if (additionalFocusKeys != null) __obj.updateDynamic("additionalFocusKeys")(additionalFocusKeys)
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (!js.isUndefined(autopadContent)) __obj.updateDynamic("autopadContent")(autopadContent)
    if (!js.isUndefined(autosizeContent)) __obj.updateDynamic("autosizeContent")(autosizeContent)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(containFocus)) __obj.updateDynamic("containFocus")(containFocus)
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (contentComponent != null) __obj.updateDynamic("contentComponent")(contentComponent.asInstanceOf[js.Any])
    if (contentProps != null) __obj.updateDynamic("contentProps")(contentProps)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (!js.isUndefined(defaultVisibleTransitionable)) __obj.updateDynamic("defaultVisibleTransitionable")(defaultVisibleTransitionable)
    if (dialogClassName != null) __obj.updateDynamic("dialogClassName")(dialogClassName)
    if (dialogStyle != null) __obj.updateDynamic("dialogStyle")(dialogStyle)
    if (!js.isUndefined(focusOnMount)) __obj.updateDynamic("focusOnMount")(focusOnMount)
    if (footerClassName != null) __obj.updateDynamic("footerClassName")(footerClassName)
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle)
    if (!js.isUndefined(fullPage)) __obj.updateDynamic("fullPage")(fullPage)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (initialFocus != null) __obj.updateDynamic("initialFocus")(initialFocus)
    if (!js.isUndefined(lastChild)) __obj.updateDynamic("lastChild")(lastChild)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (!js.isUndefined(paddedContent)) __obj.updateDynamic("paddedContent")(paddedContent)
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    if (!js.isUndefined(portal)) __obj.updateDynamic("portal")(portal)
    if (renderNode != null) __obj.updateDynamic("renderNode")(renderNode)
    if (!js.isUndefined(stackedActions)) __obj.updateDynamic("stackedActions")(stackedActions)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleClassName != null) __obj.updateDynamic("titleClassName")(titleClassName)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    if (transitionEnterTimeout != null) __obj.updateDynamic("transitionEnterTimeout")(transitionEnterTimeout.asInstanceOf[js.Any])
    if (transitionLeaveTimeout != null) __obj.updateDynamic("transitionLeaveTimeout")(transitionLeaveTimeout.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogContainerProps]
  }
}

