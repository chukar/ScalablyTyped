package typings.atStorybookClientDashApi.distConfigUnderscoreApiMod

import typings.node.NodeModule
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigApi extends js.Object {
  var _channel: typings.atStorybookChannels.atStorybookChannelsMod.default
  var _storyStore: typings.atStorybookClientDashApi.distStoryUnderscoreStoreMod.default
  var clientApi: typings.atStorybookClientDashApi.distClientUnderscoreApiMod.default
  def _clearDecorators(): Unit
  def _renderError(err: Error): Unit
  def _renderMain(): Unit
  def configure(loaders: js.Function0[Unit], module: NodeModule): Unit
}

object ConfigApi {
  @scala.inline
  def apply(
    _channel: typings.atStorybookChannels.atStorybookChannelsMod.default,
    _clearDecorators: () => Unit,
    _renderError: Error => Unit,
    _renderMain: () => Unit,
    _storyStore: typings.atStorybookClientDashApi.distStoryUnderscoreStoreMod.default,
    clientApi: typings.atStorybookClientDashApi.distClientUnderscoreApiMod.default,
    configure: (js.Function0[Unit], NodeModule) => Unit
  ): ConfigApi = {
    val __obj = js.Dynamic.literal(_channel = _channel.asInstanceOf[js.Any], _clearDecorators = js.Any.fromFunction0(_clearDecorators), _renderError = js.Any.fromFunction1(_renderError), _renderMain = js.Any.fromFunction0(_renderMain), _storyStore = _storyStore.asInstanceOf[js.Any], clientApi = clientApi.asInstanceOf[js.Any], configure = js.Any.fromFunction2(configure))
  
    __obj.asInstanceOf[ConfigApi]
  }
}

