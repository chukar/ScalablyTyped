package typings.ejDotWebDotAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** This event will be triggered before AJAX loads.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.undefined
  /** This event will be triggered when AJAX result is failed.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.undefined
  /** This event will be triggered when AJAX result is succeeded.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.undefined
  /** Shows or hides the items of configuration pane in ReportDesigner control.
    */
  var configurePaneSettings: js.UndefOr[ConfigurePaneSettings] = js.undefined
  /** This event will be triggered when the Report Designer widget is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** This event will be triggered when the Report Designer widget is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Specifies the locale for report designer.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** This event will be triggered while initiating new data click action. You can suppress the new data creation panel and perform custom actions.
    */
  var newDataClick: js.UndefOr[js.Function1[/* e */ NewDataClickEventArgs, Unit]] = js.undefined
  /** This event will be triggered while clicking open menu items.
    */
  var openReportClick: js.UndefOr[js.Function1[/* e */ OpenReportClickEventArgs, Unit]] = js.undefined
  /** Shows or hides the create, edit, and delete options in data source and dataset panels.
    * @Default {ej.ReportDesigner.Permission.All}
    */
  var permissionSettings: js.UndefOr[PermissionSettings] = js.undefined
  /** This event will be triggered while previewing the report in RDLC mode. It can be used to suppress the preview data dialog in RDLC mode.
    */
  var previewReport: js.UndefOr[js.Function1[/* e */ PreviewReportEventArgs, Unit]] = js.undefined
  /** Gets or sets the list of custom data extension items.
    * @Default {[]}
    */
  var reportDataExtensions: js.UndefOr[js.Array[ReportDataExtension]] = js.undefined
  /** Gets or sets the list of custom report items.
    * @Default {[]}
    */
  var reportItemExtensions: js.UndefOr[js.Array[ReportItemExtension]] = js.undefined
  /** This event will be triggered when the report is modified.
    */
  var reportModified: js.UndefOr[js.Function1[/* e */ ReportModifiedEventArgs, Unit]] = js.undefined
  /** This event will be triggered when the report is opened.
    */
  var reportOpened: js.UndefOr[js.Function1[/* e */ ReportOpenedEventArgs, Unit]] = js.undefined
  /** Gets or sets the report path of server.
    * @Default {null}
    */
  var reportPath: js.UndefOr[String] = js.undefined
  /** This event will be triggered when the report is saved.
    */
  var reportSaved: js.UndefOr[js.Function1[/* e */ ReportSavedEventArgs, Unit]] = js.undefined
  /** Gets or sets the reports server URL.
    * @Default {null}
    */
  var reportServerUrl: js.UndefOr[String] = js.undefined
  /** Gets or sets the report type.
    * @Default {ej.ReportDesigner.ReportType.RDL}
    */
  var reportType: js.UndefOr[String] = js.undefined
  /** This event will be triggered when the save menu items are clicked.
    */
  var saveReportClick: js.UndefOr[js.Function1[/* e */ SaveReportClickEventArgs, Unit]] = js.undefined
  /** Gets or sets the serviceAuthorizationToken to access the Report Server API services.
    * @Default {empty}
    */
  var serviceAuthorizationToken: js.UndefOr[String] = js.undefined
  /** Gets or sets the URL of the  WebAPI service; it will be used for processing the report.
    * @Default {null}
    */
  var serviceUrl: js.UndefOr[String] = js.undefined
  /** Gets or sets the tenant name of the user groups; it will be used when integrating report designer with server.
    * @Default {null}
    */
  var tenantName: js.UndefOr[String] = js.undefined
  /** This event will be triggered while clicking the toolbar items.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.undefined
  /** This event will be triggered on rendering the Report Designer toolbar.
    */
  var toolbarRendering: js.UndefOr[js.Function1[/* e */ ToolbarRenderingEventArgs, Unit]] = js.undefined
  /** Defines the settings of the ReportDesigner toolbar.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    ajaxBeforeLoad: /* e */ AjaxBeforeLoadEventArgs => Unit = null,
    ajaxError: /* e */ AjaxErrorEventArgs => Unit = null,
    ajaxSuccess: /* e */ AjaxSuccessEventArgs => Unit = null,
    configurePaneSettings: ConfigurePaneSettings = null,
    create: /* e */ CreateEventArgs => Unit = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    locale: String = null,
    newDataClick: /* e */ NewDataClickEventArgs => Unit = null,
    openReportClick: /* e */ OpenReportClickEventArgs => Unit = null,
    permissionSettings: PermissionSettings = null,
    previewReport: /* e */ PreviewReportEventArgs => Unit = null,
    reportDataExtensions: js.Array[ReportDataExtension] = null,
    reportItemExtensions: js.Array[ReportItemExtension] = null,
    reportModified: /* e */ ReportModifiedEventArgs => Unit = null,
    reportOpened: /* e */ ReportOpenedEventArgs => Unit = null,
    reportPath: String = null,
    reportSaved: /* e */ ReportSavedEventArgs => Unit = null,
    reportServerUrl: String = null,
    reportType: String = null,
    saveReportClick: /* e */ SaveReportClickEventArgs => Unit = null,
    serviceAuthorizationToken: String = null,
    serviceUrl: String = null,
    tenantName: String = null,
    toolbarClick: /* e */ ToolbarClickEventArgs => Unit = null,
    toolbarRendering: /* e */ ToolbarRenderingEventArgs => Unit = null,
    toolbarSettings: ToolbarSettings = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (ajaxBeforeLoad != null) __obj.updateDynamic("ajaxBeforeLoad")(js.Any.fromFunction1(ajaxBeforeLoad))
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction1(ajaxError))
    if (ajaxSuccess != null) __obj.updateDynamic("ajaxSuccess")(js.Any.fromFunction1(ajaxSuccess))
    if (configurePaneSettings != null) __obj.updateDynamic("configurePaneSettings")(configurePaneSettings.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (newDataClick != null) __obj.updateDynamic("newDataClick")(js.Any.fromFunction1(newDataClick))
    if (openReportClick != null) __obj.updateDynamic("openReportClick")(js.Any.fromFunction1(openReportClick))
    if (permissionSettings != null) __obj.updateDynamic("permissionSettings")(permissionSettings.asInstanceOf[js.Any])
    if (previewReport != null) __obj.updateDynamic("previewReport")(js.Any.fromFunction1(previewReport))
    if (reportDataExtensions != null) __obj.updateDynamic("reportDataExtensions")(reportDataExtensions.asInstanceOf[js.Any])
    if (reportItemExtensions != null) __obj.updateDynamic("reportItemExtensions")(reportItemExtensions.asInstanceOf[js.Any])
    if (reportModified != null) __obj.updateDynamic("reportModified")(js.Any.fromFunction1(reportModified))
    if (reportOpened != null) __obj.updateDynamic("reportOpened")(js.Any.fromFunction1(reportOpened))
    if (reportPath != null) __obj.updateDynamic("reportPath")(reportPath.asInstanceOf[js.Any])
    if (reportSaved != null) __obj.updateDynamic("reportSaved")(js.Any.fromFunction1(reportSaved))
    if (reportServerUrl != null) __obj.updateDynamic("reportServerUrl")(reportServerUrl.asInstanceOf[js.Any])
    if (reportType != null) __obj.updateDynamic("reportType")(reportType.asInstanceOf[js.Any])
    if (saveReportClick != null) __obj.updateDynamic("saveReportClick")(js.Any.fromFunction1(saveReportClick))
    if (serviceAuthorizationToken != null) __obj.updateDynamic("serviceAuthorizationToken")(serviceAuthorizationToken.asInstanceOf[js.Any])
    if (serviceUrl != null) __obj.updateDynamic("serviceUrl")(serviceUrl.asInstanceOf[js.Any])
    if (tenantName != null) __obj.updateDynamic("tenantName")(tenantName.asInstanceOf[js.Any])
    if (toolbarClick != null) __obj.updateDynamic("toolbarClick")(js.Any.fromFunction1(toolbarClick))
    if (toolbarRendering != null) __obj.updateDynamic("toolbarRendering")(js.Any.fromFunction1(toolbarRendering))
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

