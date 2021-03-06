package typings.atJupyterlabDocregistry.libMimedocumentMod

import typings.atJupyterlabDocregistry.libDefaultMod.ABCWidgetFactory
import typings.atJupyterlabDocregistry.libMimedocumentMod.MimeDocumentFactory.IOptions
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib/mimedocument", "MimeDocumentFactory")
@js.native
class MimeDocumentFactory_ protected () extends ABCWidgetFactory[MimeDocument, IModel] {
  /**
    * Construct a new mimetype widget factory.
    */
  def this(options: IOptions[MimeDocument]) = this()
  var _dataType: js.Any = js.native
  var _fileType: js.Any = js.native
  var _renderTimeout: js.Any = js.native
  var _rendermime: js.Any = js.native
}

