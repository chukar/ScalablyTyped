package typings.sipDotJs

import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashClientMod.UserAgentClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/publish-user-agent-client", JSImport.Namespace)
@js.native
object libCoreUserDashAgentsPublishDashUserDashAgentDashClientMod extends js.Object {
  @js.native
  class PublishUserAgentClient protected () extends UserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
}

