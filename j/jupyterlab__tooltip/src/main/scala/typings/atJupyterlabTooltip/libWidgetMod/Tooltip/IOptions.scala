package typings.atJupyterlabTooltip.libWidgetMod.Tooltip

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instantiation options for a tooltip widget.
  */
trait IOptions extends js.Object {
  /**
    * The anchor widget that the tooltip widget tracks.
    */
  var anchor: Widget
  /**
    * The data that populates the tooltip widget.
    */
  var bundle: JSONObject
  /**
    * The editor referent of the tooltip model.
    */
  var editor: IEditor
  /**
    * The rendermime instance used by the tooltip model.
    */
  var rendermime: IRenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply(anchor: Widget, bundle: JSONObject, editor: IEditor, rendermime: IRenderMimeRegistry): IOptions = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], bundle = bundle.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

