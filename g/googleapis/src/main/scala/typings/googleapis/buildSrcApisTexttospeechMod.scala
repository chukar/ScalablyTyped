package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleDashAuthDashLibrary.buildSrcAuthJwtclientMod.JWTOptions
import typings.googleapis.buildSrcApisTexttospeechV1Mod.texttospeech_v1.Options
import typings.googleapis.buildSrcApisTexttospeechV1Mod.texttospeech_v1.Texttospeech
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import typings.googleapisDashCommon.googleapisDashCommonMod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/texttospeech", JSImport.Namespace)
@js.native
object buildSrcApisTexttospeechMod extends js.Object {
  def texttospeech(options: Options): Texttospeech = js.native
  def texttospeech(options: typings.googleapis.buildSrcApisTexttospeechV1beta1Mod.texttospeech_v1beta1.Options): typings.googleapis.buildSrcApisTexttospeechV1beta1Mod.texttospeech_v1beta1.Texttospeech = js.native
  @JSName("texttospeech")
  def texttospeech_v1(version: v1): Texttospeech = js.native
  @JSName("texttospeech")
  def texttospeech_v1beta1(version: v1beta1): typings.googleapis.buildSrcApisTexttospeechV1beta1Mod.texttospeech_v1beta1.Texttospeech = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Texttospeech {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta1 protected ()
      extends typings.googleapis.buildSrcApisTexttospeechV1beta1Mod.texttospeech_v1beta1.Texttospeech {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Texttospeech
              ]
            ]
    
    @js.native
    object v1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.buildSrcApisTexttospeechV1beta1Mod.texttospeech_v1beta1.Texttospeech
              ]
            ]
    
  }
  
  @js.native
  object auth extends TopLevel[AuthPlus] {
    @js.native
    /**
      * Google Compute Engine service account credentials.
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    class Compute ()
      extends typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
    
    @js.native
    class JWT protected ()
      extends typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT {
      /**
        * JWT service account credentials.
        *
        * Retrieve access token using gtoken.
        *
        * @param email service account email address.
        * @param keyFile path to private key file.
        * @param key value of key
        * @param scopes list of requested scopes or a single scope.
        * @param subject impersonated account's email address.
        * @param key_id the ID of the key
        */
      def this(options: JWTOptions) = this()
    }
    
  }
  
}

