package typings.antd.libMenuMenuItemMod

import typings.antd.Anon_DomEvent
import typings.antd.antdStrings.`additions text`
import typings.antd.antdStrings.`inline`
import typings.antd.antdStrings.additions
import typings.antd.antdStrings.all
import typings.antd.antdStrings.ascending
import typings.antd.antdStrings.assertive
import typings.antd.antdStrings.both
import typings.antd.antdStrings.copy
import typings.antd.antdStrings.date
import typings.antd.antdStrings.decimal
import typings.antd.antdStrings.descending
import typings.antd.antdStrings.dialog
import typings.antd.antdStrings.email
import typings.antd.antdStrings.execute
import typings.antd.antdStrings.grammar
import typings.antd.antdStrings.grid
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.inherit
import typings.antd.antdStrings.link
import typings.antd.antdStrings.list
import typings.antd.antdStrings.listbox
import typings.antd.antdStrings.location
import typings.antd.antdStrings.menu
import typings.antd.antdStrings.mixed
import typings.antd.antdStrings.move
import typings.antd.antdStrings.no
import typings.antd.antdStrings.none
import typings.antd.antdStrings.numeric
import typings.antd.antdStrings.off
import typings.antd.antdStrings.on
import typings.antd.antdStrings.other
import typings.antd.antdStrings.page
import typings.antd.antdStrings.polite
import typings.antd.antdStrings.popup
import typings.antd.antdStrings.removals
import typings.antd.antdStrings.search
import typings.antd.antdStrings.spelling
import typings.antd.antdStrings.step
import typings.antd.antdStrings.tel
import typings.antd.antdStrings.text
import typings.antd.antdStrings.time
import typings.antd.antdStrings.tree
import typings.antd.antdStrings.url
import typings.antd.antdStrings.vertical
import typings.antd.antdStrings.yes
import typings.antd.libMenuMod.ClickParam
import typings.react.Anon_Html
import typings.react.reactMod.AnimationEvent
import typings.react.reactMod.AnimationEventHandler
import typings.react.reactMod.Booleanish
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ClipboardEvent
import typings.react.reactMod.ClipboardEventHandler
import typings.react.reactMod.CompositionEvent
import typings.react.reactMod.CompositionEventHandler
import typings.react.reactMod.DragEvent
import typings.react.reactMod.DragEventHandler
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.FormEvent
import typings.react.reactMod.FormEventHandler
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.PointerEvent
import typings.react.reactMod.PointerEventHandler
import typings.react.reactMod.ReactEventHandler
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.react.reactMod.TouchEvent
import typings.react.reactMod.TouchEventHandler
import typings.react.reactMod.TransitionEvent
import typings.react.reactMod.TransitionEventHandler
import typings.react.reactMod.UIEvent
import typings.react.reactMod.UIEventHandler
import typings.react.reactMod.WheelEvent
import typings.react.reactMod.WheelEventHandler
import typings.std.Event
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<react.react.HTMLAttributes<std.HTMLLIElement>, 'title' | 'onClick' | 'onMouseEnter' | 'onMouseLeave'> */
trait MenuItemProps extends js.Object {
  var about: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var `aria-level`: js.UndefOr[Double] = js.undefined
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  var `aria-owns`: js.UndefOr[String] = js.undefined
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Anon_Html] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLLIElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLLIElement]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLLIElement]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLLIElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onChange: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* param */ ClickParam, Unit]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLLIElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLLIElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLLIElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLLIElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLLIElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[HTMLLIElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLLIElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLLIElement]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ Anon_DomEvent, Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ Anon_DomEvent, Unit]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLLIElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLLIElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[HTMLLIElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[HTMLLIElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLLIElement]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLLIElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLLIElement]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[HTMLLIElement]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var rootPrefixCls: js.UndefOr[String] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    level: Int | Double = null,
    onAbort: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[HTMLLIElement] => Unit = null,
    onAnimationIteration: AnimationEvent[HTMLLIElement] => Unit = null,
    onAnimationStart: AnimationEvent[HTMLLIElement] => Unit = null,
    onAuxClick: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[HTMLLIElement] => Unit = null,
    onBlur: FocusEvent[HTMLLIElement] => Unit = null,
    onCanPlay: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onChange: FormEvent[HTMLLIElement] => Unit = null,
    onClick: /* param */ ClickParam => Unit = null,
    onCompositionEnd: CompositionEvent[HTMLLIElement] => Unit = null,
    onCompositionStart: CompositionEvent[HTMLLIElement] => Unit = null,
    onCompositionUpdate: CompositionEvent[HTMLLIElement] => Unit = null,
    onContextMenu: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[HTMLLIElement] => Unit = null,
    onCut: ClipboardEvent[HTMLLIElement] => Unit = null,
    onDoubleClick: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[HTMLLIElement] => Unit = null,
    onDragEnd: DragEvent[HTMLLIElement] => Unit = null,
    onDragEnter: DragEvent[HTMLLIElement] => Unit = null,
    onDragExit: DragEvent[HTMLLIElement] => Unit = null,
    onDragLeave: DragEvent[HTMLLIElement] => Unit = null,
    onDragOver: DragEvent[HTMLLIElement] => Unit = null,
    onDragStart: DragEvent[HTMLLIElement] => Unit = null,
    onDrop: DragEvent[HTMLLIElement] => Unit = null,
    onDurationChange: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onEmptied: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onEncrypted: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onEnded: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onError: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onFocus: FocusEvent[HTMLLIElement] => Unit = null,
    onInput: FormEvent[HTMLLIElement] => Unit = null,
    onInvalid: FormEvent[HTMLLIElement] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLLIElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLLIElement] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLLIElement] => Unit = null,
    onLoad: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onLoadStart: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onLoadedData: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onMouseDown: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: /* e */ Anon_DomEvent => Unit = null,
    onMouseLeave: /* e */ Anon_DomEvent => Unit = null,
    onMouseMove: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[HTMLLIElement] => Unit = null,
    onPause: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onPlay: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onPlaying: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onPointerCancel: PointerEvent[HTMLLIElement] => Unit = null,
    onPointerDown: PointerEvent[HTMLLIElement] => Unit = null,
    onPointerEnter: PointerEvent[HTMLLIElement] => Unit = null,
    onPointerLeave: PointerEvent[HTMLLIElement] => Unit = null,
    onPointerMove: PointerEvent[HTMLLIElement] => Unit = null,
    onPointerOut: PointerEvent[HTMLLIElement] => Unit = null,
    onPointerOver: PointerEvent[HTMLLIElement] => Unit = null,
    onPointerUp: PointerEvent[HTMLLIElement] => Unit = null,
    onProgress: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onRateChange: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onReset: FormEvent[HTMLLIElement] => Unit = null,
    onScroll: UIEvent[HTMLLIElement] => Unit = null,
    onSeeked: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onSeeking: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onSelect: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onStalled: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onSubmit: FormEvent[HTMLLIElement] => Unit = null,
    onSuspend: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onTouchCancel: TouchEvent[HTMLLIElement] => Unit = null,
    onTouchEnd: TouchEvent[HTMLLIElement] => Unit = null,
    onTouchMove: TouchEvent[HTMLLIElement] => Unit = null,
    onTouchStart: TouchEvent[HTMLLIElement] => Unit = null,
    onTransitionEnd: TransitionEvent[HTMLLIElement] => Unit = null,
    onVolumeChange: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onWaiting: SyntheticEvent[HTMLLIElement, Event] => Unit = null,
    onWheel: WheelEvent[HTMLLIElement] => Unit = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    rootPrefixCls: String = null,
    security: String = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    title: ReactNode = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null
  ): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemProps]
  }
}

