package typings.mendixmodelsdk.distSdkInternalUnitsMod

import typings.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because var conflicts: container, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/sdk/internal/units", "AbstractUnit")
@js.native
abstract class AbstractUnit protected () extends Structure {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IStructuralUnit
  ) = this()
  @JSName("container")
  val container_FAbstractUnit: StructuralUnit = js.native
  def deepCopyInto(newParent: IStructuralUnit): AbstractUnit = js.native
  /**
    * Checks whether all attributes are available at this instant;
    * if false, a load is required to access these properties.
    */
  @JSName("isLoaded")
  def isLoaded_MAbstractUnit(): Boolean = js.native
}

