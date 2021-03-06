package typings.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Reflog")
@js.native
class Reflog ()
  extends typings.nodegit.refDashLogMod.Reflog

/* static members */
@JSImport("nodegit", "Reflog")
@js.native
object Reflog extends js.Object {
  def delete(repo: typings.nodegit.repositoryMod.Repository, name: String): Double = js.native
  def read(repo: typings.nodegit.repositoryMod.Repository, name: String): js.Promise[typings.nodegit.refDashLogMod.Reflog] = js.native
  def rename(repo: typings.nodegit.repositoryMod.Repository, oldName: String, name: String): Double = js.native
}

