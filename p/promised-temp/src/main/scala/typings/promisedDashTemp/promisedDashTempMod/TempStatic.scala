package typings.promisedDashTemp.promisedDashTempMod

import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TempStatic extends js.Object {
  var dir: String = js.native
  def cleanup(): js.Promise[Boolean | Stats] = js.native
  def createWriteStream(): js.Promise[WriteStream] = js.native
  def createWriteStream(affixes: String): js.Promise[WriteStream] = js.native
  def createWriteStream(affixes: AffixOptions): js.Promise[WriteStream] = js.native
  def mkdir(): js.Promise[String] = js.native
  def mkdir(affixes: String): js.Promise[String] = js.native
  def mkdir(affixes: AffixOptions): js.Promise[String] = js.native
  def open(): js.Promise[OpenFile] = js.native
  def open(affixes: String): js.Promise[OpenFile] = js.native
  def open(affixes: AffixOptions): js.Promise[OpenFile] = js.native
  def path(): String = js.native
  def path(affixes: String): String = js.native
  def path(affixes: String, defaultPrefix: String): String = js.native
  def path(affixes: AffixOptions): String = js.native
  def path(affixes: AffixOptions, defaultPrefix: String): String = js.native
  def track(): TempStatic = js.native
  def track(value: Boolean): TempStatic = js.native
}

