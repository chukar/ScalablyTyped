package typings.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Checkout")
@js.native
class Checkout ()
  extends typings.nodegit.checkoutMod.Checkout

/* static members */
@JSImport("nodegit", "Checkout")
@js.native
object Checkout extends js.Object {
  /**
    * Patch head checkout to automatically coerce objects.
    */
  def head(repo: typings.nodegit.repositoryMod.Repository): js.Promise[Unit] = js.native
  def head(
    repo: typings.nodegit.repositoryMod.Repository,
    options: typings.nodegit.checkoutDashOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  /**
    * Patch index checkout to automatically coerce objects.
    */
  def index(repo: typings.nodegit.repositoryMod.Repository, The: Index): js.Promise[Unit] = js.native
  def index(
    repo: typings.nodegit.repositoryMod.Repository,
    The: Index,
    options: typings.nodegit.checkoutDashOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  def initOptions(opts: typings.nodegit.checkoutDashOptionsMod.CheckoutOptions, version: Double): Double = js.native
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.commitMod.Commit): js.Promise[Unit] = js.native
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.commitMod.Commit,
    options: typings.nodegit.checkoutDashOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  /**
    * Patch tree checkout to automatically coerce objects.
    */
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.oidMod.Oid): js.Promise[Unit] = js.native
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.oidMod.Oid,
    options: typings.nodegit.checkoutDashOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.referenceMod.Reference): js.Promise[Unit] = js.native
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.referenceMod.Reference,
    options: typings.nodegit.checkoutDashOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
  def tree(repo: typings.nodegit.repositoryMod.Repository, treeish: typings.nodegit.treeMod.Tree): js.Promise[Unit] = js.native
  def tree(
    repo: typings.nodegit.repositoryMod.Repository,
    treeish: typings.nodegit.treeMod.Tree,
    options: typings.nodegit.checkoutDashOptionsMod.CheckoutOptions
  ): js.Promise[Unit] = js.native
}

