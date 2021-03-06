package typings.atFirebaseAnalytics

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseInstallationsDashTypes.atFirebaseInstallationsDashTypesMod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/analytics/dist/testing/get-fake-firebase-services", JSImport.Namespace)
@js.native
object distTestingGetDashFakeDashFirebaseDashServicesMod extends js.Object {
  def getFakeApp(): FirebaseApp = js.native
  def getFakeApp(measurementId: String): FirebaseApp = js.native
  def getFakeInstallations(): FirebaseInstallations = js.native
  def getFakeInstallations(fid: String): FirebaseInstallations = js.native
}

