package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.documenttemplates

import typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `DocumentTemplates`.
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.Widget")
@js.native
abstract class Widget protected ()
  extends typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.Widget")
@js.native
object Widget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

