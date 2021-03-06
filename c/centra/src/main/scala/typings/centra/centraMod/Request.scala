package typings.centra.centraMod

import org.scalablytyped.runtime.StringDictionary
import typings.centra.centraStrings._defaultAgent
import typings.centra.centraStrings.agent
import typings.centra.centraStrings.auth
import typings.centra.centraStrings.buffer
import typings.centra.centraStrings.defaultPort
import typings.centra.centraStrings.family
import typings.centra.centraStrings.form
import typings.centra.centraStrings.headers
import typings.centra.centraStrings.host
import typings.centra.centraStrings.hostname
import typings.centra.centraStrings.json
import typings.centra.centraStrings.localAddress
import typings.centra.centraStrings.method
import typings.centra.centraStrings.path
import typings.centra.centraStrings.port
import typings.centra.centraStrings.protocol
import typings.centra.centraStrings.setHost
import typings.centra.centraStrings.socketPath
import typings.centra.centraStrings.timeout
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var compressionEnabled: Boolean = js.native
  var coreOptions: RequestOptions = js.native
  var data: String | Buffer | Null = js.native
  var method: String = js.native
  var reqHeaders: StringDictionary[String] = js.native
  var sendDataAs: form | json | buffer | Null = js.native
  var streamEnabled: Boolean = js.native
  var timeoutTime: Double | Null = js.native
  var url: URL = js.native
  def body(data: js.Any): this.type = js.native
  @JSName("body")
  def body_buffer(data: js.Any, sendAs: buffer): this.type = js.native
  @JSName("body")
  def body_form(data: js.Any, sendAs: form): this.type = js.native
  @JSName("body")
  def body_json(data: js.Any, sendAs: json): this.type = js.native
  def compress(): this.type = js.native
  def header(headers: StringDictionary[String]): this.type = js.native
  def header(key: String, value: String): this.type = js.native
  @JSName("option")
  def option_agent(key: agent, value: Boolean): this.type = js.native
  @JSName("option")
  def option_agent(key: agent, value: Agent): this.type = js.native
  @JSName("option")
  def option_auth(key: auth): this.type = js.native
  @JSName("option")
  def option_auth(key: auth, value: String): this.type = js.native
  @JSName("option")
  def option_defaultAgent(key: _defaultAgent, value: Agent): this.type = js.native
  @JSName("option")
  def option_defaultPort(key: defaultPort, value: String): this.type = js.native
  @JSName("option")
  def option_defaultPort(key: defaultPort, value: Double): this.type = js.native
  @JSName("option")
  def option_family(key: family, value: Double): this.type = js.native
  @JSName("option")
  def option_headers(key: headers, value: OutgoingHttpHeaders): this.type = js.native
  @JSName("option")
  def option_host(key: host): this.type = js.native
  @JSName("option")
  def option_host(key: host, value: String): this.type = js.native
  @JSName("option")
  def option_hostname(key: hostname): this.type = js.native
  @JSName("option")
  def option_hostname(key: hostname, value: String): this.type = js.native
  @JSName("option")
  def option_localAddress(key: localAddress, value: String): this.type = js.native
  @JSName("option")
  def option_method(key: method, value: String): this.type = js.native
  @JSName("option")
  def option_path(key: path): this.type = js.native
  @JSName("option")
  def option_path(key: path, value: String): this.type = js.native
  @JSName("option")
  def option_port(key: port): this.type = js.native
  @JSName("option")
  def option_port(key: port, value: String): this.type = js.native
  @JSName("option")
  def option_port(key: port, value: Double): this.type = js.native
  @JSName("option")
  def option_protocol(key: protocol): this.type = js.native
  @JSName("option")
  def option_protocol(key: protocol, value: String): this.type = js.native
  @JSName("option")
  def option_setHost(key: setHost, value: Boolean): this.type = js.native
  @JSName("option")
  def option_socketPath(key: socketPath, value: String): this.type = js.native
  @JSName("option")
  def option_timeout(key: timeout, value: Double): this.type = js.native
  def path(relativePath: String): this.type = js.native
  def query(key: String, value: js.Any): this.type = js.native
  def query(params: StringDictionary[js.Any]): this.type = js.native
  def send(): js.Promise[Response] = js.native
  def stream(): this.type = js.native
  def timeout(timeMs: Double): this.type = js.native
}

