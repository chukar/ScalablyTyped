package typings.officeDashUiDashFabricDashReact.libComponentsAutofillAutofillDotTypesMod

import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libKeyCodesMod.KeyCodes
import typings.officeDashUiDashFabricDashReact.libComponentsAutofillAutofillMod.Autofill
import typings.react.Anon_Html
import typings.react.reactMod.AnimationEvent
import typings.react.reactMod.Booleanish
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.ClipboardEvent
import typings.react.reactMod.CompositionEvent
import typings.react.reactMod.DragEvent
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FormEvent
import typings.react.reactMod.InputHTMLAttributes
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.PointerEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.react.reactMod.TouchEvent
import typings.react.reactMod.TransitionEvent
import typings.react.reactMod.UIEvent
import typings.react.reactMod.WheelEvent
import typings.react.reactStrings.`additions text`
import typings.react.reactStrings.`inline`
import typings.react.reactStrings.additions
import typings.react.reactStrings.all
import typings.react.reactStrings.ascending
import typings.react.reactStrings.assertive
import typings.react.reactStrings.both
import typings.react.reactStrings.copy
import typings.react.reactStrings.date
import typings.react.reactStrings.decimal
import typings.react.reactStrings.descending
import typings.react.reactStrings.dialog
import typings.react.reactStrings.email
import typings.react.reactStrings.execute
import typings.react.reactStrings.grammar
import typings.react.reactStrings.grid
import typings.react.reactStrings.horizontal
import typings.react.reactStrings.inherit
import typings.react.reactStrings.link
import typings.react.reactStrings.list
import typings.react.reactStrings.listbox
import typings.react.reactStrings.location
import typings.react.reactStrings.menu
import typings.react.reactStrings.mixed
import typings.react.reactStrings.move
import typings.react.reactStrings.no
import typings.react.reactStrings.none
import typings.react.reactStrings.numeric
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.react.reactStrings.other
import typings.react.reactStrings.page
import typings.react.reactStrings.polite
import typings.react.reactStrings.popup
import typings.react.reactStrings.removals
import typings.react.reactStrings.search
import typings.react.reactStrings.spelling
import typings.react.reactStrings.step
import typings.react.reactStrings.tel
import typings.react.reactStrings.text
import typings.react.reactStrings.time
import typings.react.reactStrings.tree
import typings.react.reactStrings.url
import typings.react.reactStrings.vertical
import typings.react.reactStrings.yes
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutofillProps extends InputHTMLAttributes[HTMLInputElement | Autofill] {
  /**
    * Gets the compoonent ref.
    */
  var componentRef: js.UndefOr[IRefObject[IAutofill]] = js.undefined
  /**
    * The default value to be visible. This is different from placeholder
    * because it actually sets the current value of the picker
    * Note: This will only be set upon component creation
    * and will not update with subsequent prop updates.
    */
  var defaultVisibleValue: js.UndefOr[String] = js.undefined
  /**
    * When the user uses left arrow, right arrow, clicks, or deletes text autofill is disabled
    * Since the user has taken control. It is automatically reenabled when the user enters text and the
    * cursor is at the end of the text in the input box. This specifies other key presses that will reenabled
    * autofill.
    * @defaultvalue [KeyCodes.down, KeyCodes.up]
    */
  var enableAutofillOnKeyPress: js.UndefOr[js.Array[KeyCodes]] = js.undefined
  /**
    * A callback used to modify the input string.
    *
    * @param composing - true if the change event was triggered while the
    * inner input was in the middle of a multi-character composition.
    * (for example, jp-hiragana IME input)
    */
  var onInputChange: js.UndefOr[js.Function2[/* value */ String, /* composing */ Boolean, String]] = js.undefined
  /**
    * A callback for when the current input value changes.
    *
    * @param composing - true if the change event was triggered while the
    * inner input was in the middle of a multi-character composition.
    * (for example, jp-hiragana IME input)
    */
  var onInputValueChange: js.UndefOr[
    js.Function2[/* newValue */ js.UndefOr[String], /* composing */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /**
    * Should the value of the input be selected? True if we're focused on our input, false otherwise.
    * We need to explicitly not select the text in the autofill if we are no longer focused.
    * In IE11, selecting a input will also focus the input, causing other element's focus to be stolen.
    */
  var preventValueSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * Handler for checking if the full value of the input should
    * be seleced in componentDidUpdate
    *
    * @returns - should the full value of the input be selected?
    */
  var shouldSelectFullInputValueInComponentDidUpdate: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /**
    * The suggested autofill value that will display.
    */
  var suggestedDisplayValue: js.UndefOr[String] = js.undefined
  /**
    * Handler for checking and updating the value if needed
    * in componentWillReceiveProps
    *
    * @returns - the updated value to set, if needed
    */
  var updateValueInWillReceiveProps: js.UndefOr[js.Function0[String | Null]] = js.undefined
}

object IAutofillProps {
  @scala.inline
  def apply(
    about: String = null,
    accept: String = null,
    accessKey: String = null,
    alt: String = null,
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
    autoComplete: String = null,
    autoCorrect: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoSave: String = null,
    capture: Boolean | String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    componentRef: IRefObject[IAutofill] = null,
    contentEditable: Booleanish | inherit = null,
    contextMenu: String = null,
    crossOrigin: String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    defaultVisibleValue: String = null,
    dir: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    enableAutofillOnKeyPress: js.Array[KeyCodes] = null,
    form: String = null,
    formAction: String = null,
    formEncType: String = null,
    formMethod: String = null,
    formNoValidate: js.UndefOr[Boolean] = js.undefined,
    formTarget: String = null,
    height: Double | String = null,
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
    list: String = null,
    max: Double | String = null,
    maxLength: Int | Double = null,
    min: Double | String = null,
    minLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onAbort: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[HTMLInputElement | Autofill] => Unit = null,
    onAnimationIteration: AnimationEvent[HTMLInputElement | Autofill] => Unit = null,
    onAnimationStart: AnimationEvent[HTMLInputElement | Autofill] => Unit = null,
    onAuxClick: MouseEvent[HTMLInputElement | Autofill, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[HTMLInputElement | Autofill] => Unit = null,
    onBlur: FocusEvent[HTMLInputElement | Autofill] => Unit = null,
    onCanPlay: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onChange: ChangeEvent[HTMLInputElement | Autofill] => Unit = null,
    onClick: MouseEvent[HTMLInputElement | Autofill, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[HTMLInputElement | Autofill] => Unit = null,
    onCompositionStart: CompositionEvent[HTMLInputElement | Autofill] => Unit = null,
    onCompositionUpdate: CompositionEvent[HTMLInputElement | Autofill] => Unit = null,
    onContextMenu: MouseEvent[HTMLInputElement | Autofill, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[HTMLInputElement | Autofill] => Unit = null,
    onCut: ClipboardEvent[HTMLInputElement | Autofill] => Unit = null,
    onDoubleClick: MouseEvent[HTMLInputElement | Autofill, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[HTMLInputElement | Autofill] => Unit = null,
    onDragEnd: DragEvent[HTMLInputElement | Autofill] => Unit = null,
    onDragEnter: DragEvent[HTMLInputElement | Autofill] => Unit = null,
    onDragExit: DragEvent[HTMLInputElement | Autofill] => Unit = null,
    onDragLeave: DragEvent[HTMLInputElement | Autofill] => Unit = null,
    onDragOver: DragEvent[HTMLInputElement | Autofill] => Unit = null,
    onDragStart: DragEvent[HTMLInputElement | Autofill] => Unit = null,
    onDrop: DragEvent[HTMLInputElement | Autofill] => Unit = null,
    onDurationChange: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onEmptied: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onEncrypted: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onEnded: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onError: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onFocus: FocusEvent[HTMLInputElement | Autofill] => Unit = null,
    onInput: FormEvent[HTMLInputElement | Autofill] => Unit = null,
    onInputChange: (/* value */ String, /* composing */ Boolean) => String = null,
    onInputValueChange: (/* newValue */ js.UndefOr[String], /* composing */ js.UndefOr[Boolean]) => Unit = null,
    onInvalid: FormEvent[HTMLInputElement | Autofill] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLInputElement | Autofill] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLInputElement | Autofill] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLInputElement | Autofill] => Unit = null,
    onLoad: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onLoadStart: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onLoadedData: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onMouseDown: MouseEvent[HTMLInputElement | Autofill, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLInputElement | Autofill, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLInputElement | Autofill, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLInputElement | Autofill, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[HTMLInputElement | Autofill, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[HTMLInputElement | Autofill, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLInputElement | Autofill, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[HTMLInputElement | Autofill] => Unit = null,
    onPause: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onPlay: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onPlaying: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onPointerCancel: PointerEvent[HTMLInputElement | Autofill] => Unit = null,
    onPointerDown: PointerEvent[HTMLInputElement | Autofill] => Unit = null,
    onPointerEnter: PointerEvent[HTMLInputElement | Autofill] => Unit = null,
    onPointerLeave: PointerEvent[HTMLInputElement | Autofill] => Unit = null,
    onPointerMove: PointerEvent[HTMLInputElement | Autofill] => Unit = null,
    onPointerOut: PointerEvent[HTMLInputElement | Autofill] => Unit = null,
    onPointerOver: PointerEvent[HTMLInputElement | Autofill] => Unit = null,
    onPointerUp: PointerEvent[HTMLInputElement | Autofill] => Unit = null,
    onProgress: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onRateChange: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onReset: FormEvent[HTMLInputElement | Autofill] => Unit = null,
    onScroll: UIEvent[HTMLInputElement | Autofill] => Unit = null,
    onSeeked: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onSeeking: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onSelect: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onStalled: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onSubmit: FormEvent[HTMLInputElement | Autofill] => Unit = null,
    onSuspend: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onTouchCancel: TouchEvent[HTMLInputElement | Autofill] => Unit = null,
    onTouchEnd: TouchEvent[HTMLInputElement | Autofill] => Unit = null,
    onTouchMove: TouchEvent[HTMLInputElement | Autofill] => Unit = null,
    onTouchStart: TouchEvent[HTMLInputElement | Autofill] => Unit = null,
    onTransitionEnd: TransitionEvent[HTMLInputElement | Autofill] => Unit = null,
    onVolumeChange: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onWaiting: SyntheticEvent[HTMLInputElement | Autofill, Event] => Unit = null,
    onWheel: WheelEvent[HTMLInputElement | Autofill] => Unit = null,
    pattern: String = null,
    placeholder: String = null,
    prefix: String = null,
    preventValueSelection: js.UndefOr[Boolean] = js.undefined,
    property: String = null,
    radioGroup: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    shouldSelectFullInputValueInComponentDidUpdate: () => Boolean = null,
    size: Int | Double = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    step: Double | String = null,
    style: CSSProperties = null,
    suggestedDisplayValue: String = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    title: String = null,
    translate: yes | no = null,
    `type`: String = null,
    typeof: String = null,
    unselectable: on | off = null,
    updateValueInWillReceiveProps: () => String | Null = null,
    value: String | js.Array[String] | Double = null,
    vocab: String = null,
    width: Double | String = null
  ): IAutofillProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
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
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (defaultVisibleValue != null) __obj.updateDynamic("defaultVisibleValue")(defaultVisibleValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (enableAutofillOnKeyPress != null) __obj.updateDynamic("enableAutofillOnKeyPress")(enableAutofillOnKeyPress.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType.asInstanceOf[js.Any])
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate.asInstanceOf[js.Any])
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
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
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
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
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction2(onInputChange))
    if (onInputValueChange != null) __obj.updateDynamic("onInputValueChange")(js.Any.fromFunction2(onInputValueChange))
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
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(preventValueSelection)) __obj.updateDynamic("preventValueSelection")(preventValueSelection.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (shouldSelectFullInputValueInComponentDidUpdate != null) __obj.updateDynamic("shouldSelectFullInputValueInComponentDidUpdate")(js.Any.fromFunction0(shouldSelectFullInputValueInComponentDidUpdate))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suggestedDisplayValue != null) __obj.updateDynamic("suggestedDisplayValue")(suggestedDisplayValue.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (updateValueInWillReceiveProps != null) __obj.updateDynamic("updateValueInWillReceiveProps")(js.Any.fromFunction0(updateValueInWillReceiveProps))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutofillProps]
  }
}

