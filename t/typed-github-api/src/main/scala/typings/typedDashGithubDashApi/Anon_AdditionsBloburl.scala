package typings.typedDashGithubDashApi

import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.modified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionsBloburl extends js.Object {
  var additions: Double
  var blob_url: String
  var changes: Double
  var deletions: Double
  var filename: String
  var patch: String
  var raw_url: String
  var status: modified
}

object Anon_AdditionsBloburl {
  @scala.inline
  def apply(
    additions: Double,
    blob_url: String,
    changes: Double,
    deletions: Double,
    filename: String,
    patch: String,
    raw_url: String,
    status: modified
  ): Anon_AdditionsBloburl = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], blob_url = blob_url.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], raw_url = raw_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AdditionsBloburl]
  }
}

