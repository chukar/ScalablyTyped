package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Repositories", JSImport.Namespace)
@js.native
object distTypesCoreServicesRepositoriesMod extends js.Object {
  @js.native
  class Repositories () extends BaseService {
    def compare(projectId: String, from: String, to: String): js.Promise[GetResponse] = js.native
    def compare(projectId: String, from: String, to: String, options: Sudo): js.Promise[GetResponse] = js.native
    def compare(projectId: Double, from: String, to: String): js.Promise[GetResponse] = js.native
    def compare(projectId: Double, from: String, to: String, options: Sudo): js.Promise[GetResponse] = js.native
    def contributors(projectId: String): js.Promise[GetResponse] = js.native
    def contributors(projectId: String, options: Sudo): js.Promise[GetResponse] = js.native
    def contributors(projectId: Double): js.Promise[GetResponse] = js.native
    def contributors(projectId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def mergeBase(projectId: String, refs: js.Array[String]): js.Promise[GetResponse] = js.native
    def mergeBase(projectId: String, refs: js.Array[String], options: Sudo): js.Promise[GetResponse] = js.native
    def mergeBase(projectId: Double, refs: js.Array[String]): js.Promise[GetResponse] = js.native
    def mergeBase(projectId: Double, refs: js.Array[String], options: Sudo): js.Promise[GetResponse] = js.native
    def showArchive(projectId: String): js.Promise[GetResponse] = js.native
    def showArchive(projectId: String, options: Anon_ShaString with Sudo): js.Promise[GetResponse] = js.native
    def showArchive(projectId: Double): js.Promise[GetResponse] = js.native
    def showArchive(projectId: Double, options: Anon_ShaString with Sudo): js.Promise[GetResponse] = js.native
    def showBlob(projectId: String, sha: String): js.Promise[GetResponse] = js.native
    def showBlob(projectId: String, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    def showBlob(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
    def showBlob(projectId: Double, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    def showBlobRaw(projectId: String, sha: String): js.Promise[GetResponse] = js.native
    def showBlobRaw(projectId: String, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    def showBlobRaw(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
    def showBlobRaw(projectId: Double, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    def tree(projectId: String): js.Promise[GetResponse] = js.native
    def tree(projectId: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def tree(projectId: Double): js.Promise[GetResponse] = js.native
    def tree(projectId: Double, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
  
}

