package typings.videoDotJs.videoDotJsMod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XhrObject extends Xhr {
  @JSName("del")
  var del_Original: Xhr = js.native
  @JSName("get")
  var get_Original: Xhr = js.native
  @JSName("head")
  var head_Original: Xhr = js.native
  @JSName("patch")
  var patch_Original: Xhr = js.native
  @JSName("post")
  var post_Original: Xhr = js.native
  @JSName("put")
  var put_Original: Xhr = js.native
  def del(url: String, callback: XhrCallback): js.Any = js.native
  def del(url: String, options: XhrOptions, callback: XhrCallback): js.Any = js.native
  def del(url: XhrOptions, callback: XhrCallback): js.Any = js.native
  def get(url: String, callback: XhrCallback): js.Any = js.native
  def get(url: String, options: XhrOptions, callback: XhrCallback): js.Any = js.native
  def get(url: XhrOptions, callback: XhrCallback): js.Any = js.native
  def head(url: String, callback: XhrCallback): js.Any = js.native
  def head(url: String, options: XhrOptions, callback: XhrCallback): js.Any = js.native
  def head(url: XhrOptions, callback: XhrCallback): js.Any = js.native
  def patch(url: String, callback: XhrCallback): js.Any = js.native
  def patch(url: String, options: XhrOptions, callback: XhrCallback): js.Any = js.native
  def patch(url: XhrOptions, callback: XhrCallback): js.Any = js.native
  def post(url: String, callback: XhrCallback): js.Any = js.native
  def post(url: String, options: XhrOptions, callback: XhrCallback): js.Any = js.native
  def post(url: XhrOptions, callback: XhrCallback): js.Any = js.native
  def put(url: String, callback: XhrCallback): js.Any = js.native
  def put(url: String, options: XhrOptions, callback: XhrCallback): js.Any = js.native
  def put(url: XhrOptions, callback: XhrCallback): js.Any = js.native
}

