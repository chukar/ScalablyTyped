package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/validation-message relevant section in reference guide}
  *
  * In version 7.0.2: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ValidationMessage")
@js.native
class ValidationMessage protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FValidationMessage: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ValidationMessage")
@js.native
object ValidationMessage extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ValidationMessage = js.native
  /**
    * Creates and returns a new ValidationMessage instance in the SDK and on the server.
    * The new ValidationMessage will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): ValidationMessage = js.native
}

