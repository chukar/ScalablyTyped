package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.0.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenPagesMod.pages.ILayoutContent because Already inherited
- typings.mendixmodelsdk.distGenPagesMod.pages.IWebLayoutContent because var conflicts: containerAsLayout, id, isLoaded, model, structureTypeName, unit. Inlined layoutType, layoutCall */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.WebLayoutContent")
@js.native
class WebLayoutContent protected () extends LayoutContent {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("layoutCall")
  val layoutCall_FWebLayoutContent: ILayoutCall | Null = js.native
  @JSName("layoutType")
  val layoutType_FWebLayoutContent: LayoutType = js.native
  @JSName("model")
  var model_FWebLayoutContent: IModel = js.native
  @JSName("containerAsLayout")
  def containerAsLayout_MWebLayoutContent(): Layout = js.native
  def layoutCall(): LayoutCall | Null = js.native
  def layoutCall(newValue: LayoutCall): js.Any = js.native
  @JSName("layoutCall")
  def layoutCall_Any(): js.Any = js.native
  def layoutType(): LayoutType = js.native
  def layoutType(newValue: LayoutType): js.Any = js.native
  def widgets(): IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.WebLayoutContent")
@js.native
object WebLayoutContent extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WebLayoutContent instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WebLayoutContent = js.native
  /**
    * Creates and returns a new WebLayoutContent instance in the SDK and on the server.
    * The new WebLayoutContent will be automatically stored in the 'content' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: Layout): WebLayoutContent = js.native
}

