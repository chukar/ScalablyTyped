package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.EntityWidget
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenPagesMod.pages.CreateObjectClientAction
import typings.mendixmodelsdk.distGenPagesMod.pages.EntityPathSource
import typings.mendixmodelsdk.distGenPagesMod.pages.NewButton
import typings.mendixmodelsdk.distGenPagesMod.pages.ReferenceSetSelector
import typings.mendixmodelsdk.distGenPagesMod.pages.SelectorXPathSource
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.IndirectEntityRef")
@js.native
class IndirectEntityRef protected () extends EntityRef {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FIndirectEntityRef: IModel = js.native
  def steps(): IList[EntityRefStep] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.IndirectEntityRef")
@js.native
object IndirectEntityRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.CreateObjectClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInCreateObjectClientActionUnderEntityRef(container: CreateObjectClientAction): IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.EntityPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInEntityPathSourceUnderEntityRef(container: EntityPathSource): IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent documenttemplates.EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInEntityWidgetUnderEntityRef(container: EntityWidget): IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent MemberRef element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInMemberRefUnderEntityRef(container: MemberRef): IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.NewButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 to 7.16.0
    */
  def createInNewButtonUnderEntityRef(container: NewButton): IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInReferenceSetSelectorUnderConstrainedByRefs(container: ReferenceSetSelector): IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.SelectorXPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInSelectorXPathSourceUnderConstrainedByRefs(container: SelectorXPathSource): IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInWidgetValueUnderEntityRef(container: WidgetValue): IndirectEntityRef = js.native
}

