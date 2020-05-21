package entities;

	private static class AccountSGC{
        private double liqPst;
        private double cotaBruta;
        private double margemConsig;

        public AccountSGC(float liqPst, float cotaBruta) {
            this.liqPst = liqPst;
            this.cotaBruta = cotaBruta;
        }

        public double getLiqPst() {
            return liqPst;
        }

        public void setLiqPst(float liqPst) {
            this.liqPst = liqPst;
        }

        public double getCotaBruta() {
            return cotaBruta;
        }

        public void setCotaBruta(float cotaBruta) {
            this.cotaBruta = cotaBruta;
        }

        public double getMargemConsig() {
            return margemConsig;
        }

        public void setMargemConsig(int somaConsig, double margBruPres) {
            margemConsig = (liqPst + somaConsig - margBruPres) * 1.00;
        }
    }

