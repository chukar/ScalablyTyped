package typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsMod

import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButton
import typings.officeDashUiDashFabricDashReact.libComponentsPickersSuggestionsSuggestionsDotTypesMod.ISuggestionsProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesMod.BaseComponent
import typings.react.reactMod.RefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions", "Suggestions")
@js.native
class Suggestions[T] protected () extends BaseComponent[ISuggestionsProps[T], ISuggestionsState] {
  def this(suggestionsProps: ISuggestionsProps[T]) = this()
  var _classNames: js.Any = js.native
  var _forceResolve: js.Any = js.native
  var _forceResolveButton: RefObject[IButton] = js.native
  var _getAlertText: js.Any = js.native
  var _getMoreResults: js.Any = js.native
  var _onClickTypedSuggestionsItem: js.Any = js.native
  var _onRemoveTypedSuggestionsItem: js.Any = js.native
  var _refocusOnSuggestions: js.Any = js.native
  var _renderSuggestions: js.Any = js.native
  var _searchForMoreButton: RefObject[IButton] = js.native
  var _selectedElement: RefObject[HTMLDivElement] = js.native
  var _shouldShowForceResolve: js.Any = js.native
  var activeSelectedElement: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSuggestions(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSuggestions(): Unit = js.native
  def executeSelectedAction(): Unit = js.native
  def focusAboveSuggestions(): Unit = js.native
  def focusBelowSuggestions(): Unit = js.native
  def focusSearchForMoreButton(): Unit = js.native
  def hasSuggestedAction(): Boolean = js.native
  def hasSuggestedActionSelected(): Boolean = js.native
  def scrollSelected(): Unit = js.native
  /**
    * Returns true if the event was handled, false otherwise
    */
  def tryHandleKeyDown(keyCode: Double, currentSuggestionIndex: Double): Boolean = js.native
}

