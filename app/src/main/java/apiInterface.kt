import com.example.customer_care_ui.PostModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface apiInterface {

    @Headers("Ocp-Apim-Subscription-Key: 23835e387fda4748b2aed408f9e90e8c")
    @GET(value = "nl-ns-apim-ds.azure-api.net/dev-darwin-lc/v1/customerSupport/getAddExtentiondata/9916965096/")
    fun getData():Call<List<PostModel>>
}