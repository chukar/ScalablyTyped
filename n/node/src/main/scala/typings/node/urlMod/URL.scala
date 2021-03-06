package typings.node.urlMod

import typings.node.fsMod._PathLike
import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url", "URL")
@js.native
class URL protected () extends _PathLike {
  def this(input: String) = this()
  def this(input: String, base: String) = this()
  def this(input: String, base: URL) = this()
  var hash: String = js.native
  var host: String = js.native
  var hostname: String = js.native
  var href: String = js.native
  val origin: String = js.native
  var password: String = js.native
  var pathname: String = js.native
  var port: String = js.native
  var protocol: String = js.native
  var search: String = js.native
  val searchParams: URLSearchParams = js.native
  var username: String = js.native
  def toJSON(): String = js.native
}

// Output of `url.parse`
trait Url extends js.Object {
  var auth: String | Null
  var hash: String | Null
  var host: String | Null
  var hostname: String | Null
  var href: String
  var path: String | Null
  var pathname: String | Null
  var port: String | Null
  var protocol: String | Null
  var query: String | Null | ParsedUrlQuery
  var search: String | Null
  var slashes: Boolean | Null
}

object Url {
  @scala.inline
  def apply(
    href: String,
    auth: String = null,
    hash: String = null,
    host: String = null,
    hostname: String = null,
    path: String = null,
    pathname: String = null,
    port: String = null,
    protocol: String = null,
    query: String | ParsedUrlQuery = null,
    search: String = null,
    slashes: js.UndefOr[Boolean] = js.undefined
  ): Url = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (!js.isUndefined(slashes)) __obj.updateDynamic("slashes")(slashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
}

