import http from "@/http-common";

/* eslint-disable */
class ImmigrationService {
  getAll() {
    return http.get("/api/user");
  }
  getLastId() {
    return http.get("/api/identityCard/last-id");
  }
  create(data) {
    return http.post("/api/immigrationInformation", data);
  }
  countPurposeByDay(purpose,from,to) {
    // return http.post("/api/immigrationInformation", data);
    return http.get(`/api/immigrationInformation/count/byday/purpose/${purpose}?from=${from}&to=${to}`);
  }
  countIdCardByDay(cardName,from,to) {
    // return http.post("/api/immigrationInformation", data);
    return http.get(`/api/immigrationInformation/count/byday/identitycard/${cardName}?from=${from}&to=${to}`);
  }
  countLicenseByDay(licenseName,from,to) {
    // return http.post("/api/immigrationInformation", data);
    return http.get(`/api/immigrationInformation/count/byday/license/${licenseName}?from=${from}&to=${to}`);
  }
}
export default new ImmigrationService();
