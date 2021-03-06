package typings.webtorrent.webtorrentMod

import typings.node.Buffer
import typings.node.NodeJS.EventEmitter
import typings.node.NodeJS.ReadableStream
import typings.std.Blob
import typings.std.Error
import typings.std.HTMLElement
import typings.std.HTMLMediaElement
import typings.webtorrent.Anon_Autoplay
import typings.webtorrent.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentFile extends EventEmitter {
  val downloaded: Double = js.native
  val length: Double = js.native
  val name: String = js.native
  val path: String = js.native
  def appendTo(rootElement: String): Unit = js.native
  def appendTo(
    rootElement: String,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def appendTo(rootElement: String, opts: Anon_Autoplay): Unit = js.native
  def appendTo(
    rootElement: String,
    opts: Anon_Autoplay,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def appendTo(rootElement: HTMLElement): Unit = js.native
  def appendTo(
    rootElement: HTMLElement,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def appendTo(rootElement: HTMLElement, opts: Anon_Autoplay): Unit = js.native
  def appendTo(
    rootElement: HTMLElement,
    opts: Anon_Autoplay,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def createReadStream(): ReadableStream = js.native
  def createReadStream(opts: Anon_End): ReadableStream = js.native
  def deselect(): Unit = js.native
  def getBlob(callback: js.Function2[/* err */ js.UndefOr[String | Error], /* blob */ js.UndefOr[Blob], Unit]): Unit = js.native
  def getBlobURL(
    callback: js.Function2[/* err */ js.UndefOr[String | Error], /* blobURL */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def getBuffer(
    callback: js.Function2[/* err */ js.UndefOr[String | Error], /* buffer */ js.UndefOr[Buffer], Unit]
  ): Unit = js.native
  def renderTo(rootElement: String): Unit = js.native
  def renderTo(
    rootElement: String,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def renderTo(rootElement: String, opts: Anon_Autoplay): Unit = js.native
  def renderTo(
    rootElement: String,
    opts: Anon_Autoplay,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def renderTo(rootElement: HTMLMediaElement): Unit = js.native
  def renderTo(
    rootElement: HTMLMediaElement,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def renderTo(rootElement: HTMLMediaElement, opts: Anon_Autoplay): Unit = js.native
  def renderTo(
    rootElement: HTMLMediaElement,
    opts: Anon_Autoplay,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def select(): Unit = js.native
}

