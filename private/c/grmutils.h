PyArrayObject *pyvector(PyObject *objin);
double *pyvector_to_Carray(PyArrayObject *arrayin);
PyArrayObject *pymatrix(PyObject *objin);
double **pymatrix_to_Carray(PyArrayObject *arrayin);
void free_Carrayptrs(double **v);
double **ptrvector(long n);
static PyObject *grm_loadDosage(PyObject *self, PyObject *args);
static PyObject* error_out(PyObject *m);
static int logitPredict_traverse(PyObject *m,visitproc visit, void *arg);
static int logitPredict_clear(PyObject *m);
static PyObject *grm_calcdistance(PyObject *self, PyObject *args);
static PyObject *grm_calcdistance_nomissing(PyObject *self,PyObject *args);
static PyObject *grm_cleanup(PyObject *m);
double **DOSAGES;
PyObject *DOSAGES_PYMAT_OBJ;
int N_VARIANTS,N_SAMPLES;
static double _calcDistance(int i, int j);