package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.EntityRef
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenReportsMod.reports.ReportPane
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.17.0: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton")
@js.native
class NewButton protected () extends Button {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FNewButton: IModel = js.native
  /**
    * In version 6.3.0: deleted
    */
  def entity(): IEntity | Null = js.native
  def entity(newValue: IEntity): js.Any = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyEntityPath.
    *
    * In version 7.11.0: deleted
    * In version 6.3.0: introduced
    */
  def entityPath(): String = js.native
  def entityPath(newValue: String): js.Any = js.native
  def entityQualifiedName(): String | Null = js.native
  /**
    * In version 7.11.0: introduced
    */
  def entityRef(): EntityRef | Null = js.native
  def entityRef(newValue: EntityRef): js.Any = js.native
  @JSName("entityRef")
  def entityRef_Any(): js.Any = js.native
  @JSName("entity")
  def entity_Any(): js.Any = js.native
  def pageSettings(): PageSettings = js.native
  def pageSettings(newValue: PageSettings): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton")
@js.native
object NewButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInDataViewUnderFooterWidgets(container: DataView): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInDataViewUnderWidgets(container: DataView): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInDivContainerUnderWidgets(container: DivContainer): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInHeaderUnderLeftWidgets(container: Header): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInHeaderUnderRightWidgets(container: Header): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInLayoutUnderWidgets(container: Layout): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInListViewUnderWidgets(container: ListView): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInSnippetUnderWidgets(container: Snippet): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInTabPageUnderWidgets(container: TabPage): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInTableCellUnderWidgets(container: TableCell): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): NewButton = js.native
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): NewButton = js.native
}

