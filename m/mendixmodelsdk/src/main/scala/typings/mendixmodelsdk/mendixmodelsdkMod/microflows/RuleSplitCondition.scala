package typings.mendixmodelsdk.mendixmodelsdkMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "microflows.RuleSplitCondition")
@js.native
class RuleSplitCondition protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.RuleSplitCondition {
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
@JSImport("mendixmodelsdk", "microflows.RuleSplitCondition")
@js.native
object RuleSplitCondition extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RuleSplitCondition instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.RuleSplitCondition = js.native
  /**
    * Creates and returns a new RuleSplitCondition instance in the SDK and on the server.
    * The new RuleSplitCondition will be automatically stored in the 'splitCondition' property
    * of the parent ExclusiveSplit element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ExclusiveSplit): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.RuleSplitCondition = js.native
}

