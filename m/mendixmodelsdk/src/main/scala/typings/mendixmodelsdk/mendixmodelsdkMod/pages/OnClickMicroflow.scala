package typings.mendixmodelsdk.mendixmodelsdkMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.18.0: deleted
  */
@JSImport("mendixmodelsdk", "pages.OnClickMicroflow")
@js.native
class OnClickMicroflow protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.OnClickMicroflow {
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
@JSImport("mendixmodelsdk", "pages.OnClickMicroflow")
@js.native
object OnClickMicroflow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new OnClickMicroflow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.OnClickMicroflow = js.native
  /**
    * Creates and returns a new OnClickMicroflow instance in the SDK and on the server.
    * The new OnClickMicroflow will be automatically stored in the 'onClickBehavior' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.17.0
    */
  def createIn(container: typings.mendixmodelsdk.distGenPagesMod.pages.DynamicImageViewer): typings.mendixmodelsdk.distGenPagesMod.pages.OnClickMicroflow = js.native
}

