package typings
package reactDashMdLib.libSelectFieldsSelectFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectFieldProps extends SharedSelectFieldProps {
  /**
    * @deprecated
    */
  var adjustMinWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    */
  var defaultOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    */
  var floatingLabel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    */
  var iconChildren: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * @deprecated
    */
  var iconClassName: js.UndefOr[java.lang.String] = js.undefined
  @JSName("id")
  var id_SelectFieldProps: reactDashMdLib.libMod.IdPropType
  /**
    * @deprecated
    */
  var initiallyOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    */
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    */
  var menuClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @deprecated
    */
  var menuStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  /**
    * @deprecated
    */
  var noAutoAdjust: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    */
  var onMenuToggle: js.UndefOr[js.Function] = js.undefined
  /**
    * @deprecated
    */
  var stretchList: js.UndefOr[scala.Boolean] = js.undefined
}

object SelectFieldProps {
  @scala.inline
  def apply(
    id: reactDashMdLib.libMod.IdPropType,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    adjustMinWidth: js.UndefOr[scala.Boolean] = js.undefined,
    anchor: reactDashMdLib.libHelpersLayoverMod.LayoverAnchor = null,
    belowAnchor: reactDashMdLib.libHelpersLayoverMod.LayoverAnchor = null,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    closeOnOutsideClick: js.UndefOr[scala.Boolean] = js.undefined,
    customSize: java.lang.String = null,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: scala.Double | java.lang.String = null,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    deleteKeys: scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String]) = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownIcon: reactLib.reactMod.ReactElement[_] = null,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    errorText: reactLib.reactMod.ReactNode = null,
    fillViewportHeight: js.UndefOr[scala.Boolean] = js.undefined,
    fillViewportWidth: js.UndefOr[scala.Boolean] = js.undefined,
    fixedTo: js.Object | reactDashMdLib.Anon_X = null,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    floatingLabel: js.UndefOr[scala.Boolean] = js.undefined,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    getItemProps: /* data */ js.Object => js.Object = null,
    helpOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    helpText: reactLib.reactMod.ReactNode = null,
    iconChildren: reactLib.reactMod.ReactNode = null,
    iconClassName: java.lang.String = null,
    initiallyOpen: js.UndefOr[scala.Boolean] = js.undefined,
    inlineIndicator: reactLib.reactMod.ReactElement[_] = null,
    inputClassName: java.lang.String = null,
    inputStyle: reactLib.reactMod.CSSProperties = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    itemLabel: java.lang.String = null,
    itemProps: java.lang.String = null,
    itemValue: java.lang.String = null,
    keyboardMatchingTimeout: scala.Int | scala.Double = null,
    label: reactLib.reactMod.ReactNode = null,
    leftIcon: reactLib.reactMod.ReactElement[_] = null,
    leftIconStateful: js.UndefOr[scala.Boolean] = js.undefined,
    lineDirection: reactDashMdLib.libTextFieldsTextFieldMod.TextFieldLineDirections = null,
    listClassName: java.lang.String = null,
    listHeightRestricted: js.UndefOr[scala.Boolean] = js.undefined,
    listId: reactDashMdLib.libMod.IdPropType = null,
    listInline: js.UndefOr[scala.Boolean] = js.undefined,
    listProps: js.Object = null,
    listStyle: reactLib.reactMod.CSSProperties = null,
    listZDepth: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    maxRows: scala.Int | scala.Double = null,
    menuClassName: java.lang.String = null,
    menuId: reactDashMdLib.libMod.IdPropType = null,
    menuItems: js.Array[scala.Double | java.lang.String | js.Object | reactLib.reactMod.ReactElement[_]] = null,
    menuStyle: reactLib.reactMod.CSSProperties = null,
    menuTransitionEnterTimeout: scala.Int | scala.Double = null,
    menuTransitionLeaveTiemout: scala.Int | scala.Double = null,
    menuTransitionName: java.lang.String = null,
    min: scala.Int | scala.Double = null,
    minBottom: scala.Double | java.lang.String = null,
    minLeft: scala.Double | java.lang.String = null,
    minRight: scala.Double | java.lang.String = null,
    name: java.lang.String = null,
    noAutoAdjust: js.UndefOr[scala.Boolean] = js.undefined,
    onBlur: /* event */ reactLib.reactMod.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onChange: (/* value */ scala.Double | java.lang.String, /* selectedIndex */ scala.Double, /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ FieldDataProps) => scala.Unit = null,
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
    onKeyDown: /* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyUp: /* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onMenuToggle: js.Function = null,
    onMouseDown: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseEnter: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseLeave: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseMove: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOut: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOver: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseUp: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onTouchCancel: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchEnd: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchMove: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchStart: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onVisibilityChange: (/* visible */ scala.Boolean, /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    paddedBlock: js.UndefOr[scala.Boolean] = js.undefined,
    passwordIcon: reactLib.reactMod.ReactElement[_] = null,
    passwordIconChildren: reactLib.reactMod.ReactNode = null,
    passwordIconClassName: java.lang.String = null,
    passwordInitiallyVisible: js.UndefOr[scala.Boolean] = js.undefined,
    pattern: java.lang.String = null,
    placeholder: java.lang.String = null,
    position: reactDashMdLib.libHelpersLayoverMod.LayoverPositions = null,
    repositionOnResize: js.UndefOr[scala.Boolean] = js.undefined,
    repositionOnScroll: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    resize: reactDashMdLib.Anon_DisableShrink = null,
    rightIcon: reactLib.reactMod.ReactElement[_] = null,
    rightIconStateful: js.UndefOr[scala.Boolean] = js.undefined,
    rows: scala.Int | scala.Double = null,
    sameWidth: js.UndefOr[scala.Boolean] = js.undefined,
    simplifiedMenu: js.UndefOr[scala.Boolean] = js.undefined,
    step: scala.Int | scala.Double = null,
    stretchList: js.UndefOr[scala.Boolean] = js.undefined,
    stripActiveItem: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    toggleClassName: java.lang.String = null,
    toggleStyle: reactLib.reactMod.CSSProperties = null,
    toolbar: js.UndefOr[scala.Boolean] = js.undefined,
    transitionEnterTimeout: scala.Int | scala.Double = null,
    transitionLeaveTimeout: scala.Int | scala.Double = null,
    transitionName: java.lang.String = null,
    transitionTime: scala.Int | scala.Double = null,
    `type`: reactDashMdLib.libTextFieldsTextFieldMod.TextFieldTypes = null,
    value: scala.Double | java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    xThreshold: scala.Int | scala.Double = null,
    yThreshold: scala.Int | scala.Double = null
  ): SelectFieldProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(adjustMinWidth)) __obj.updateDynamic("adjustMinWidth")(adjustMinWidth)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (belowAnchor != null) __obj.updateDynamic("belowAnchor")(belowAnchor)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeOnOutsideClick)) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick)
    if (customSize != null) __obj.updateDynamic("customSize")(customSize)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (deleteKeys != null) __obj.updateDynamic("deleteKeys")(deleteKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dropdownIcon != null) __obj.updateDynamic("dropdownIcon")(dropdownIcon)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.asInstanceOf[js.Any])
    if (!js.isUndefined(fillViewportHeight)) __obj.updateDynamic("fillViewportHeight")(fillViewportHeight)
    if (!js.isUndefined(fillViewportWidth)) __obj.updateDynamic("fillViewportWidth")(fillViewportWidth)
    if (fixedTo != null) __obj.updateDynamic("fixedTo")(fixedTo.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (!js.isUndefined(floatingLabel)) __obj.updateDynamic("floatingLabel")(floatingLabel)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (getItemProps != null) __obj.updateDynamic("getItemProps")(js.Any.fromFunction1(getItemProps))
    if (!js.isUndefined(helpOnFocus)) __obj.updateDynamic("helpOnFocus")(helpOnFocus)
    if (helpText != null) __obj.updateDynamic("helpText")(helpText.asInstanceOf[js.Any])
    if (iconChildren != null) __obj.updateDynamic("iconChildren")(iconChildren.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName)
    if (!js.isUndefined(initiallyOpen)) __obj.updateDynamic("initiallyOpen")(initiallyOpen)
    if (inlineIndicator != null) __obj.updateDynamic("inlineIndicator")(inlineIndicator)
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (itemLabel != null) __obj.updateDynamic("itemLabel")(itemLabel)
    if (itemProps != null) __obj.updateDynamic("itemProps")(itemProps)
    if (itemValue != null) __obj.updateDynamic("itemValue")(itemValue)
    if (keyboardMatchingTimeout != null) __obj.updateDynamic("keyboardMatchingTimeout")(keyboardMatchingTimeout.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon)
    if (!js.isUndefined(leftIconStateful)) __obj.updateDynamic("leftIconStateful")(leftIconStateful)
    if (lineDirection != null) __obj.updateDynamic("lineDirection")(lineDirection)
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName)
    if (!js.isUndefined(listHeightRestricted)) __obj.updateDynamic("listHeightRestricted")(listHeightRestricted)
    if (listId != null) __obj.updateDynamic("listId")(listId.asInstanceOf[js.Any])
    if (!js.isUndefined(listInline)) __obj.updateDynamic("listInline")(listInline)
    if (listProps != null) __obj.updateDynamic("listProps")(listProps)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (listZDepth != null) __obj.updateDynamic("listZDepth")(listZDepth.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (menuClassName != null) __obj.updateDynamic("menuClassName")(menuClassName)
    if (menuId != null) __obj.updateDynamic("menuId")(menuId.asInstanceOf[js.Any])
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems)
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle)
    if (menuTransitionEnterTimeout != null) __obj.updateDynamic("menuTransitionEnterTimeout")(menuTransitionEnterTimeout.asInstanceOf[js.Any])
    if (menuTransitionLeaveTiemout != null) __obj.updateDynamic("menuTransitionLeaveTiemout")(menuTransitionLeaveTiemout.asInstanceOf[js.Any])
    if (menuTransitionName != null) __obj.updateDynamic("menuTransitionName")(menuTransitionName)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minBottom != null) __obj.updateDynamic("minBottom")(minBottom.asInstanceOf[js.Any])
    if (minLeft != null) __obj.updateDynamic("minLeft")(minLeft.asInstanceOf[js.Any])
    if (minRight != null) __obj.updateDynamic("minRight")(minRight.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(noAutoAdjust)) __obj.updateDynamic("noAutoAdjust")(noAutoAdjust)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
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
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onMenuToggle != null) __obj.updateDynamic("onMenuToggle")(onMenuToggle)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onVisibilityChange != null) __obj.updateDynamic("onVisibilityChange")(js.Any.fromFunction2(onVisibilityChange))
    if (!js.isUndefined(paddedBlock)) __obj.updateDynamic("paddedBlock")(paddedBlock)
    if (passwordIcon != null) __obj.updateDynamic("passwordIcon")(passwordIcon)
    if (passwordIconChildren != null) __obj.updateDynamic("passwordIconChildren")(passwordIconChildren.asInstanceOf[js.Any])
    if (passwordIconClassName != null) __obj.updateDynamic("passwordIconClassName")(passwordIconClassName)
    if (!js.isUndefined(passwordInitiallyVisible)) __obj.updateDynamic("passwordInitiallyVisible")(passwordInitiallyVisible)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(repositionOnResize)) __obj.updateDynamic("repositionOnResize")(repositionOnResize)
    if (!js.isUndefined(repositionOnScroll)) __obj.updateDynamic("repositionOnScroll")(repositionOnScroll)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon)
    if (!js.isUndefined(rightIconStateful)) __obj.updateDynamic("rightIconStateful")(rightIconStateful)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(sameWidth)) __obj.updateDynamic("sameWidth")(sameWidth)
    if (!js.isUndefined(simplifiedMenu)) __obj.updateDynamic("simplifiedMenu")(simplifiedMenu)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchList)) __obj.updateDynamic("stretchList")(stretchList)
    if (!js.isUndefined(stripActiveItem)) __obj.updateDynamic("stripActiveItem")(stripActiveItem)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (toggleClassName != null) __obj.updateDynamic("toggleClassName")(toggleClassName)
    if (toggleStyle != null) __obj.updateDynamic("toggleStyle")(toggleStyle)
    if (!js.isUndefined(toolbar)) __obj.updateDynamic("toolbar")(toolbar)
    if (transitionEnterTimeout != null) __obj.updateDynamic("transitionEnterTimeout")(transitionEnterTimeout.asInstanceOf[js.Any])
    if (transitionLeaveTimeout != null) __obj.updateDynamic("transitionLeaveTimeout")(transitionLeaveTimeout.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (transitionTime != null) __obj.updateDynamic("transitionTime")(transitionTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (xThreshold != null) __obj.updateDynamic("xThreshold")(xThreshold.asInstanceOf[js.Any])
    if (yThreshold != null) __obj.updateDynamic("yThreshold")(yThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectFieldProps]
  }
}

