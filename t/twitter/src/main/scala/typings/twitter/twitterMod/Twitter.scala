package typings.twitter.twitterMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.request.requestMod.CoreOptions
import typings.request.requestMod.Request
import typings.request.requestMod.RequestAPI
import typings.request.requestMod.RequestCallback
import typings.request.requestMod.RequiredUriUrl
import typings.twitter.twitterStrings.site
import typings.twitter.twitterStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Twitter extends js.Object {
  val VERSION: String = js.native
  val allow_promise: Boolean = js.native
  @JSName("request")
  val request_Original: RequestAPI[Request, CoreOptions, RequiredUriUrl] = js.native
  def get(path: String): js.Promise[ResponseData] = js.native
  def get(path: String, callback: Callback): Unit = js.native
  def get(path: String, params: RequestParams): js.Promise[ResponseData] = js.native
  def get(path: String, params: RequestParams, callback: Callback): Unit = js.native
  def post(path: String): js.Promise[ResponseData] = js.native
  def post(path: String, callback: Callback): Unit = js.native
  def post(path: String, params: RequestParams): js.Promise[ResponseData] = js.native
  def post(path: String, params: RequestParams, callback: Callback): Unit = js.native
  def request(options: RequiredUriUrl with CoreOptions): Request = js.native
  def request(options: RequiredUriUrl with CoreOptions, callback: RequestCallback): Request = js.native
  def request(uri: String): Request = js.native
  def request(uri: String, callback: RequestCallback): Request = js.native
  def request(uri: String, options: CoreOptions): Request = js.native
  def request(uri: String, options: CoreOptions, callback: RequestCallback): Request = js.native
  def stream(method: String): EventEmitter = js.native
  def stream(method: String, callback: js.Function1[/* stream */ EventEmitter, Unit]): Unit = js.native
  def stream(method: String, params: StringDictionary[js.Any]): EventEmitter = js.native
  def stream(
    method: String,
    params: StringDictionary[js.Any],
    callback: js.Function1[/* stream */ EventEmitter, Unit]
  ): Unit = js.native
  @JSName("stream")
  def stream_site(method: site): EventEmitter = js.native
  @JSName("stream")
  def stream_site(method: site, callback: js.Function1[/* stream */ EventEmitter, Unit]): Unit = js.native
  @JSName("stream")
  def stream_site(method: site, params: StringDictionary[js.Any]): EventEmitter = js.native
  @JSName("stream")
  def stream_site(
    method: site,
    params: StringDictionary[js.Any],
    callback: js.Function1[/* stream */ EventEmitter, Unit]
  ): Unit = js.native
  @JSName("stream")
  def stream_user(method: user): EventEmitter = js.native
  @JSName("stream")
  def stream_user(method: user, callback: js.Function1[/* stream */ EventEmitter, Unit]): Unit = js.native
  @JSName("stream")
  def stream_user(method: user, params: StringDictionary[js.Any]): EventEmitter = js.native
  @JSName("stream")
  def stream_user(
    method: user,
    params: StringDictionary[js.Any],
    callback: js.Function1[/* stream */ EventEmitter, Unit]
  ): Unit = js.native
}

