package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludedpermissionsFeatures extends js.Object {
  var excluded_permissions: js.Array[String]
  var features: js.Array[_]
  var interactions: Anon_FollowingBoolean
  var permissions: js.Array[_]
}

object Anon_ExcludedpermissionsFeatures {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    features: js.Array[_],
    interactions: Anon_FollowingBoolean,
    permissions: js.Array[_]
  ): Anon_ExcludedpermissionsFeatures = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ExcludedpermissionsFeatures]
  }
}

