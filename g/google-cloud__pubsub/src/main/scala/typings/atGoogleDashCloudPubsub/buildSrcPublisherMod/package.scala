package typings.atGoogleDashCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcPublisherMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.IPubsubMessage
  import typings.atGoogleDashCloudPubsub.buildSrcPubsubMod.RequestCallback

  type Attributes = StringDictionary[String]
  type PublishCallback = RequestCallback[String, Unit]
  type PubsubMessage = IPubsubMessage
}
