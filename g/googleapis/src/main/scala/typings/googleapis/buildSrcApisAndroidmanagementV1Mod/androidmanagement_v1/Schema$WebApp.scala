package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A web app.
  */
@js.native
trait Schema$WebApp extends js.Object {
  /**
    * The display mode of the web app.
    */
  var displayMode: js.UndefOr[String] = js.native
  /**
    * A list of icons for the web app. Must have at least one element.
    */
  var icons: js.UndefOr[js.Array[Schema$WebAppIcon]] = js.native
  /**
    * The name of the web app, which is generated by the server during creation
    * in the form enterprises/{enterpriseId}/webApps/{packageName}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The start URL, i.e. the URL that should load when the user opens the
    * application.
    */
  var startUrl: js.UndefOr[String] = js.native
  /**
    * The title of the web app as displayed to the user (e.g., amongst a list
    * of other applications, or as a label for an icon).
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The current version of the app.&lt;p&gt;Note that the version can
    * automatically increase during the lifetime of the web app, while Google
    * does internal housekeeping to keep the web app up-to-date.
    */
  var versionCode: js.UndefOr[String] = js.native
}

object Schema$WebApp {
  @scala.inline
  def apply(
    displayMode: String = null,
    icons: js.Array[Schema$WebAppIcon] = null,
    name: String = null,
    startUrl: String = null,
    title: String = null,
    versionCode: String = null
  ): Schema$WebApp = {
    val __obj = js.Dynamic.literal()
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (startUrl != null) __obj.updateDynamic("startUrl")(startUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WebApp]
  }
}

