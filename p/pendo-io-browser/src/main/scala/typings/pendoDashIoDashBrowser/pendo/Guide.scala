package typings.pendoDashIoDashBrowser.pendo

import typings.pendoDashIoDashBrowser.Anon_Badge
import typings.pendoDashIoDashBrowser.Anon_Filters
import typings.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.api
import typings.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.automatic
import typings.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.badge
import typings.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.disabled
import typings.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.dom
import typings.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.draft
import typings.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.launcher
import typings.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.published
import typings.pendoDashIoDashBrowser.pendoDashIoDashBrowserStrings.staged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guide extends js.Object {
  var attributes: Anon_Badge
  var audience: js.Array[_]
   // TODO
  var audienceUiHint: Anon_Filters
  var createdAt: Double
  var createdByUser: User
  var id: String
  var isMultiStep: Boolean
  var kind: String
  var lastUpdatedAt: Double
  var lastUpdatedByUser: User
  var launchMethod: api | automatic | badge | dom | launcher
  var name: String
  var publishedAt: Double
   // TODO
  var resetAt: Double
  var rootVersionId: String
  var stableVersionId: String
  var state: published | staged | draft | disabled
  var steps: js.Array[GuideStep]
}

object Guide {
  @scala.inline
  def apply(
    attributes: Anon_Badge,
    audience: js.Array[_],
    audienceUiHint: Anon_Filters,
    createdAt: Double,
    createdByUser: User,
    id: String,
    isMultiStep: Boolean,
    kind: String,
    lastUpdatedAt: Double,
    lastUpdatedByUser: User,
    launchMethod: api | automatic | badge | dom | launcher,
    name: String,
    publishedAt: Double,
    resetAt: Double,
    rootVersionId: String,
    stableVersionId: String,
    state: published | staged | draft | disabled,
    steps: js.Array[GuideStep]
  ): Guide = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], audience = audience.asInstanceOf[js.Any], audienceUiHint = audienceUiHint.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdByUser = createdByUser.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isMultiStep = isMultiStep.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], lastUpdatedByUser = lastUpdatedByUser.asInstanceOf[js.Any], launchMethod = launchMethod.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], resetAt = resetAt.asInstanceOf[js.Any], rootVersionId = rootVersionId.asInstanceOf[js.Any], stableVersionId = stableVersionId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Guide]
  }
}

