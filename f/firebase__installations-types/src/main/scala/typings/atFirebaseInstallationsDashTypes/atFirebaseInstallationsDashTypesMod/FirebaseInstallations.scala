package typings.atFirebaseInstallationsDashTypes.atFirebaseInstallationsDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseInstallations extends js.Object {
  /**
    * Deletes the Firebase Installation and all associated data.
    */
  def delete(): js.Promise[Unit] = js.native
  /**
    * Creates a Firebase Installation if there isn't one for the app and
    * returns the Installation ID.
    *
    * @return Firebase Installation ID
    */
  def getId(): js.Promise[String] = js.native
  /**
    * Returns an Authentication Token for the current Firebase Installation.
    *
    * @return Firebase Installation Authentication Token
    */
  def getToken(): js.Promise[String] = js.native
  def getToken(forceRefresh: Boolean): js.Promise[String] = js.native
}

