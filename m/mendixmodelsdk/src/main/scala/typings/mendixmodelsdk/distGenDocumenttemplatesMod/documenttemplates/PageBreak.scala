package typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/page-break-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.PageBreak")
@js.native
class PageBreak protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FPageBreak: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.PageBreak")
@js.native
object PageBreak extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PageBreak instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PageBreak = js.native
  /**
    * Creates and returns a new PageBreak instance in the SDK and on the server.
    * The new PageBreak will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): PageBreak = js.native
  /**
    * Creates and returns a new PageBreak instance in the SDK and on the server.
    * The new PageBreak will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  def createInDropZoneUnderWidget(container: DropZone): PageBreak = js.native
}

