package typings.koaDashGenericDashSession.koaDashGenericDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionStore extends js.Object {
  def apply(): SessionStore = js.native
  def destroy(sid: String): Unit = js.native
  def get(sid: String): js.Any = js.native
  def set(sid: String, session: Session, ttl: Double): Unit = js.native
}

