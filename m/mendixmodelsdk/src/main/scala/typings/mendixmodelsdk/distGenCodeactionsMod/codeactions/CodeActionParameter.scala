package typings.mendixmodelsdk.distGenCodeactionsMod.codeactions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCodeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.IJavaAction
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.JavaAction
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.ICodeActionParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsCodeAction, containerAsJavaAction, name, actionParameterType, description */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.CodeActionParameter")
@js.native
abstract class CodeActionParameter protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.21.0: introduced
    */
  @JSName("actionParameterType")
  val actionParameterType_FCodeActionParameter: IParameterType = js.native
  @JSName("containerAsCodeAction")
  val containerAsCodeAction_FCodeActionParameter: ICodeAction = js.native
  @JSName("containerAsJavaAction")
  val containerAsJavaAction_FCodeActionParameter: IJavaAction = js.native
  /**
    * In version 6.10.0: introduced
    */
  @JSName("description")
  val description_FCodeActionParameter: String = js.native
  @JSName("model")
  var model_FCodeActionParameter: IModel = js.native
  @JSName("name")
  val name_FCodeActionParameter: String = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  /**
    * In version 7.21.0: introduced
    */
  def actionParameterType(): ParameterType = js.native
  def actionParameterType(newValue: ParameterType): js.Any = js.native
  /**
    * In version 7.18.0: introduced
    */
  def category(): String = js.native
  def category(newValue: String): js.Any = js.native
  def containerAsCodeAction(): CodeAction = js.native
  def containerAsJavaAction(): JavaAction = js.native
  /**
    * In version 6.10.0: introduced
    */
  def description(): String = js.native
  def description(newValue: String): js.Any = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  @JSName("qualifiedName")
  def qualifiedName_MCodeActionParameter(): String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.CodeActionParameter")
@js.native
object CodeActionParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

