package typings.atOracleOraclejet.ojnboxMod

import typings.atOracleOraclejet.Anon_BorderColorBorderRadiusBorderWidthCircleColor
import typings.atOracleOraclejet.Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DocumentAndElementEventHandlersEventMap
import typings.std.DragEvent
import typings.std.ElementEventMap
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.GlobalEventHandlersEventMap
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojNBoxNodeEventMap
  extends ElementEventMap
     with GlobalEventHandlersEventMap
     with DocumentAndElementEventHandlersEventMap {
  var borderColorChanged: JetElementCustomEvent[String]
  var borderWidthChanged: JetElementCustomEvent[Double]
  var categoriesChanged: JetElementCustomEvent[js.Array[String]]
  var colorChanged: JetElementCustomEvent[js.UndefOr[String]]
  var columnChanged: JetElementCustomEvent[String]
  var groupCategoryChanged: JetElementCustomEvent[js.UndefOr[String]]
  var iconChanged: JetElementCustomEvent[js.UndefOr[Anon_BorderColorBorderRadiusBorderWidthCircleColor]]
  var indicatorColorChanged: JetElementCustomEvent[js.UndefOr[String]]
  var indicatorIconChanged: JetElementCustomEvent[js.UndefOr[Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond]]
  var labelChanged: JetElementCustomEvent[String]
  var rowChanged: JetElementCustomEvent[String]
  var secondaryLabelChanged: JetElementCustomEvent[String]
  var shortDescChanged: JetElementCustomEvent[String]
  var svgClassNameChanged: JetElementCustomEvent[String]
  var svgStyleChanged: JetElementCustomEvent[js.Object | Null]
  var xPercentageChanged: JetElementCustomEvent[js.UndefOr[Double | Null]]
  var yPercentageChanged: JetElementCustomEvent[js.UndefOr[Double | Null]]
}

object ojNBoxNodeEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    blur: FocusEvent,
    borderColorChanged: JetElementCustomEvent[String],
    borderWidthChanged: JetElementCustomEvent[Double],
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    categoriesChanged: JetElementCustomEvent[js.Array[String]],
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: JetElementCustomEvent[js.UndefOr[String]],
    columnChanged: JetElementCustomEvent[String],
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    groupCategoryChanged: JetElementCustomEvent[js.UndefOr[String]],
    iconChanged: JetElementCustomEvent[js.UndefOr[Anon_BorderColorBorderRadiusBorderWidthCircleColor]],
    indicatorColorChanged: JetElementCustomEvent[js.UndefOr[String]],
    indicatorIconChanged: JetElementCustomEvent[js.UndefOr[Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond]],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelChanged: JetElementCustomEvent[String],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadend: ProgressEvent[EventTarget],
    loadstart: Event,
    lostpointercapture: PointerEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    paste: ClipboardEvent,
    pause: Event,
    play: Event,
    playing: Event,
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    progress: ProgressEvent[EventTarget],
    ratechange: Event,
    reset: Event,
    resize: UIEvent,
    rowChanged: JetElementCustomEvent[String],
    scroll: Event,
    secondaryLabelChanged: JetElementCustomEvent[String],
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    shortDescChanged: JetElementCustomEvent[String],
    stalled: Event,
    submit: Event,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[String],
    svgStyleChanged: JetElementCustomEvent[js.Object | Null],
    timeupdate: Event,
    toggle: Event,
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent,
    xPercentageChanged: JetElementCustomEvent[js.UndefOr[Double | Null]],
    yPercentageChanged: JetElementCustomEvent[js.UndefOr[Double | Null]]
  ): ojNBoxNodeEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], borderColorChanged = borderColorChanged.asInstanceOf[js.Any], borderWidthChanged = borderWidthChanged.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], categoriesChanged = categoriesChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], columnChanged = columnChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], groupCategoryChanged = groupCategoryChanged.asInstanceOf[js.Any], iconChanged = iconChanged.asInstanceOf[js.Any], indicatorColorChanged = indicatorColorChanged.asInstanceOf[js.Any], indicatorIconChanged = indicatorIconChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelChanged = labelChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadend = loadend.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], rowChanged = rowChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], secondaryLabelChanged = secondaryLabelChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], shortDescChanged = shortDescChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], xPercentageChanged = xPercentageChanged.asInstanceOf[js.Any], yPercentageChanged = yPercentageChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojNBoxNodeEventMap]
  }
}

